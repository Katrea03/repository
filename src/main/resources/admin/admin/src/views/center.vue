<template>
  <div>
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      label-width="80px"
    >
      <el-row>
        <el-col :span="12">
          <el-form-item v-if="flag == 'yuangong'" label="工号" prop="gonghao">
            <el-input
              v-model="ruleForm.gonghao"
              readonly
              placeholder="工号"
              clearable
            ></el-input>
          </el-form-item>
        </el-col>
        <el-col :span="12">
          <el-form-item v-if="flag == 'yuangong'" label="姓名" prop="xingming">
            <el-input
              v-model="ruleForm.xingming"
              placeholder="姓名"
              clearable
            ></el-input>
          </el-form-item>
        </el-col>
        <el-col :span="12">
          <el-form-item v-if="flag == 'yuangong'" label="性别" prop="xingbie">
            <el-select v-model="ruleForm.xingbie" placeholder="请选择性别">
              <el-option
                v-for="(item, index) in yuangongxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item"
              >
              </el-option>
            </el-select>
          </el-form-item>
        </el-col>
        <el-col :span="24">
          <el-form-item v-if="flag == 'yuangong'" label="头像" prop="touxiang">
            <file-upload
              tip="点击上传头像"
              action="file/upload"
              :limit="3"
              :multiple="true"
              :fileUrls="ruleForm.touxiang ? ruleForm.touxiang : ''"
              @change="yuangongtouxiangUploadChange"
            ></file-upload>
          </el-form-item>
        </el-col>
        <el-col :span="12">
          <el-form-item v-if="flag == 'yuangong'" label="部门" prop="bumen">
            <el-select v-model="ruleForm.bumen" placeholder="请选择部门">
              <el-option
                v-for="(item, index) in yuangongbumenOptions"
                v-bind:key="index"
                :label="item"
                :value="item"
              >
              </el-option>
            </el-select>
          </el-form-item>
        </el-col>
        <el-col :span="12">
          <el-form-item v-if="flag == 'yuangong'" label="职位" prop="zhiwei">
            <el-select v-model="ruleForm.zhiwei" placeholder="请选择职位">
              <el-option
                v-for="(item, index) in yuangongzhiweiOptions"
                v-bind:key="index"
                :label="item"
                :value="item"
              >
              </el-option>
            </el-select>
          </el-form-item>
        </el-col>
        <el-col :span="12">
          <el-form-item v-if="flag == 'yuangong'" label="电话" prop="dianhua">
            <el-input
              v-model="ruleForm.dianhua"
              placeholder="电话"
              clearable
            ></el-input>
          </el-form-item>
        </el-col>
        <el-col :span="12">
          <el-form-item
            v-if="flag == 'yuangong'"
            label="在职状态"
            prop="status"
          >
            <el-select v-model="ruleForm.status" placeholder="请选择在职状态">
              <el-option
                v-for="opt in statusOptions"
                :key="opt.value"
                :label="opt.label"
                :value="opt.value"
                :disabled="
                  flag === 'yuangong' && opt.value === 'leave_rejected'
                "
              />
            </el-select>
          </el-form-item>
        </el-col>
        <el-form-item v-if="flag == 'users'" label="用户名" prop="username">
          <el-input v-model="ruleForm.username" placeholder="用户名"></el-input>
        </el-form-item>
        <el-col :span="24">
          <el-form-item>
            <el-button type="primary" @click="onUpdateHandler">修 改</el-button>
          </el-form-item>
        </el-col>
      </el-row>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import {
  isNumber,
  isIntNumer,
  isEmail,
  isMobile,
  isPhone,
  isURL,
  checkIdCard,
} from "@/utils/validate";

export default {
  data() {
    return {
      ruleForm: {},
      flag: "",
      usersFlag: false,
      yuangongxingbieOptions: [],
      yuangongbumenOptions: [],
      yuangongzhiweiOptions: [],
      statusOptions: [
        { label: "在职", value: "working" },
        { label: "离职待审核", value: "leave_pending" },
        { label: "离职审核未通过", value: "leave_rejected" },
      ],
    };
  },
  mounted() {
    var table = this.$storage.get("sessionTable");
    this.flag = table;
    this.$http({
      url: `${this.$storage.get("sessionTable")}/session`,
      method: "get",
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.ruleForm = data.data;
        if (!this.ruleForm.status) {
          this.ruleForm.status = "working";
        }
      } else {
        this.$message.error(data.msg);
      }
    });
    this.yuangongxingbieOptions = "男,女".split(",");
    this.$http({
      url: `option/bumenxinxi/bumenmingcheng`,
      method: "get",
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.yuangongbumenOptions = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
    this.$http({
      url: `option/zhiweixinxi/zhiwei`,
      method: "get",
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.yuangongzhiweiOptions = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
  },
  methods: {
    yuangongtouxiangUploadChange(fileUrls) {
      this.ruleForm.touxiang = fileUrls;
    },
    onUpdateHandler() {
      if (!this.ruleForm.gonghao && "yuangong" == this.flag) {
        this.$message.error("工号不能为空");
        return;
      }
      if (!this.ruleForm.mima && "yuangong" == this.flag) {
        this.$message.error("密码不能为空");
        return;
      }
      if (
        "yuangong" == this.flag &&
        this.ruleForm.dianhua &&
        !isMobile(this.ruleForm.dianhua)
      ) {
        this.$message.error(`电话应输入手机格式`);
        return;
      }
      if ("users" == this.flag && this.ruleForm.username.trim().length < 1) {
        this.$message.error(`用户名不能为空`);
        return;
      }
      this.$http({
        url: `${this.$storage.get("sessionTable")}/update`,
        method: "post",
        data: this.ruleForm,
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "修改信息成功",
            type: "success",
            duration: 1500,
            onClose: () => {},
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    },
  },
};
</script>
<style lang="scss" scoped></style>
