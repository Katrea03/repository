<template>
  <div class="addEdit-block">
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
      :style="{ backgroundColor: addEditForm.addEditBoxColor }"
    >
      <el-row>
        <el-col :span="12">
          <el-form-item
            class="input"
            v-if="type != 'info'"
            label="名称"
            prop="mingcheng"
          >
            <el-input
              v-model="ruleForm.mingcheng"
              placeholder="名称"
              clearable
              :readonly="ro.mingcheng"
            ></el-input>
          </el-form-item>
          <div v-else>
            <el-form-item class="input" label="名称" prop="mingcheng">
              <el-input
                v-model="ruleForm.mingcheng"
                placeholder="名称"
                readonly
              ></el-input>
            </el-form-item>
          </div>
        </el-col>
        <el-col :span="12">
          <el-form-item
            class="input"
            v-if="type != 'info'"
            label="工号"
            prop="gonghao"
          >
            <el-input
              v-model="ruleForm.gonghao"
              placeholder="工号"
              clearable
              :readonly="ro.gonghao"
            ></el-input>
          </el-form-item>
          <div v-else>
            <el-form-item class="input" label="工号" prop="gonghao">
              <el-input
                v-model="ruleForm.gonghao"
                placeholder="工号"
                readonly
              ></el-input>
            </el-form-item>
          </div>
        </el-col>
        <el-col :span="12">
          <el-form-item
            class="input"
            v-if="type != 'info'"
            label="姓名"
            prop="xingming"
          >
            <el-input
              v-model="ruleForm.xingming"
              placeholder="姓名"
              clearable
              :readonly="ro.xingming"
            ></el-input>
          </el-form-item>
          <div v-else>
            <el-form-item class="input" label="姓名" prop="xingming">
              <el-input
                v-model="ruleForm.xingming"
                placeholder="姓名"
                readonly
              ></el-input>
            </el-form-item>
          </div>
        </el-col>
        <el-col :span="12">
          <el-form-item
            class="input"
            v-if="type != 'info'"
            label="部门"
            prop="bumen"
          >
            <el-input
              v-model="ruleForm.bumen"
              placeholder="部门"
              clearable
              :readonly="ro.bumen"
            ></el-input>
          </el-form-item>
          <div v-else>
            <el-form-item class="input" label="部门" prop="bumen">
              <el-input
                v-model="ruleForm.bumen"
                placeholder="部门"
                readonly
              ></el-input>
            </el-form-item>
          </div>
        </el-col>
        <el-col :span="12">
          <el-form-item
            class="input"
            v-if="type != 'info'"
            label="职位"
            prop="zhiwei"
          >
            <el-input
              v-model="ruleForm.zhiwei"
              placeholder="职位"
              clearable
              :readonly="ro.zhiwei"
            ></el-input>
          </el-form-item>
          <div v-else>
            <el-form-item class="input" label="职位" prop="zhiwei">
              <el-input
                v-model="ruleForm.zhiwei"
                placeholder="职位"
                readonly
              ></el-input>
            </el-form-item>
          </div>
        </el-col>
        <el-col :span="12">
          <el-form-item
            class="input"
            v-if="type != 'info'"
            label="基本工资"
            prop="jibengongzi"
          >
            <el-input
              v-model="ruleForm.jibengongzi"
              placeholder="基本工资"
              clearable
              :readonly="ro.jibengongzi"
            ></el-input>
          </el-form-item>
          <div v-else>
            <el-form-item class="input" label="基本工资" prop="jibengongzi">
              <el-input
                v-model="ruleForm.jibengongzi"
                placeholder="基本工资"
                readonly
              ></el-input>
            </el-form-item>
          </div>
        </el-col>
        <el-col :span="12">
          <el-form-item
            class="input"
            v-if="type != 'info'"
            label="加班工资"
            prop="jiabangongzi"
          >
            <el-input
              v-model="ruleForm.jiabangongzi"
              placeholder="加班工资"
              clearable
              :readonly="ro.jiabangongzi"
            ></el-input>
          </el-form-item>
          <div v-else>
            <el-form-item class="input" label="加班工资" prop="jiabangongzi">
              <el-input
                v-model="ruleForm.jiabangongzi"
                placeholder="加班工资"
                readonly
              ></el-input>
            </el-form-item>
          </div>
        </el-col>
        <el-col :span="12">
          <el-form-item
            class="input"
            v-if="type != 'info'"
            label="福利"
            prop="fuli"
          >
            <el-input
              v-model="ruleForm.fuli"
              placeholder="福利"
              clearable
              :readonly="ro.fuli"
            ></el-input>
          </el-form-item>
          <div v-else>
            <el-form-item class="input" label="福利" prop="fuli">
              <el-input
                v-model="ruleForm.fuli"
                placeholder="福利"
                readonly
              ></el-input>
            </el-form-item>
          </div>
        </el-col>
        <el-col :span="12">
          <el-form-item
            class="input"
            v-if="type != 'info'"
            label="社保"
            prop="shebao"
          >
            <el-input
              v-model="ruleForm.shebao"
              placeholder="社保"
              clearable
              :readonly="ro.shebao"
            ></el-input>
          </el-form-item>
          <div v-else>
            <el-form-item class="input" label="社保" prop="shebao">
              <el-input
                v-model="ruleForm.shebao"
                placeholder="社保"
                readonly
              ></el-input>
            </el-form-item>
          </div>
        </el-col>
        <el-col :span="12">
          <el-form-item
            class="input"
            v-if="type != 'info'"
            label="扣费"
            prop="koufei"
          >
            <el-input
              v-model="ruleForm.koufei"
              placeholder="扣费"
              clearable
              :readonly="ro.koufei"
            ></el-input>
          </el-form-item>
          <div v-else>
            <el-form-item class="input" label="扣费" prop="koufei">
              <el-input
                v-model="ruleForm.koufei"
                placeholder="扣费"
                readonly
              ></el-input>
            </el-form-item>
          </div>
        </el-col>
        <el-col :span="12">
          <el-form-item
            class="input"
            v-if="type != 'info'"
            label="实发工资"
            prop="shifagongzi"
          >
            <el-input
              v-model="shifagongzi"
              placeholder="实发工资"
              readonly
            ></el-input>
          </el-form-item>
          <div v-else>
            <el-form-item
              class="input"
              v-if="ruleForm.shifagongzi"
              label="实发工资"
              prop="shifagongzi"
            >
              <el-input
                v-model="ruleForm.shifagongzi"
                placeholder="实发工资"
                readonly
              ></el-input>
            </el-form-item>
          </div>
        </el-col>
        <el-col :span="12">
          <el-form-item
            class="date"
            v-if="type != 'info'"
            label="日期"
            prop="riqi"
          >
            <el-date-picker
              format="yyyy 年 MM 月 dd 日"
              value-format="yyyy-MM-dd"
              v-model="ruleForm.riqi"
              type="date"
              placeholder="日期"
            >
            </el-date-picker>
          </el-form-item>
          <div v-else>
            <el-form-item
              class="input"
              v-if="ruleForm.riqi"
              label="日期"
              prop="riqi"
            >
              <el-input
                v-model="ruleForm.riqi"
                placeholder="日期"
                readonly
              ></el-input>
            </el-form-item>
          </div>
        </el-col>
      </el-row>
      <el-form-item class="btn">
        <el-button
          v-if="type != 'info'"
          type="primary"
          class="btn-success"
          @click="onSubmit"
          >提交</el-button
        >
        <el-button v-if="type != 'info'" class="btn-close" @click="back()"
          >取消</el-button
        >
        <el-button v-if="type == 'info'" class="btn-close" @click="back()"
          >返回</el-button
        >
      </el-form-item>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import {
  isNumber,
  isIntNumer,
  isEmail,
  isPhone,
  isMobile,
  isURL,
  checkIdCard,
} from "@/utils/validate";
export default {
  data() {
    let self = this;
    var validateIdCard = (rule, value, callback) => {
      if (!value) {
        callback();
      } else if (!checkIdCard(value)) {
        callback(new Error("请输入正确的身份证号码"));
      } else {
        callback();
      }
    };
    var validateUrl = (rule, value, callback) => {
      if (!value) {
        callback();
      } else if (!isURL(value)) {
        callback(new Error("请输入正确的URL地址"));
      } else {
        callback();
      }
    };
    var validateMobile = (rule, value, callback) => {
      if (!value) {
        callback();
      } else if (!isMobile(value)) {
        callback(new Error("请输入正确的手机号码"));
      } else {
        callback();
      }
    };
    var validatePhone = (rule, value, callback) => {
      if (!value) {
        callback();
      } else if (!isPhone(value)) {
        callback(new Error("请输入正确的电话号码"));
      } else {
        callback();
      }
    };
    var validateEmail = (rule, value, callback) => {
      if (!value) {
        callback();
      } else if (!isEmail(value)) {
        callback(new Error("请输入正确的邮箱地址"));
      } else {
        callback();
      }
    };
    var validateNumber = (rule, value, callback) => {
      if (!value) {
        callback();
      } else if (!isNumber(value)) {
        callback(new Error("请输入数字"));
      } else {
        callback();
      }
    };
    var validateIntNumber = (rule, value, callback) => {
      if (!value) {
        callback();
      } else if (!isIntNumer(value)) {
        callback(new Error("请输入整数"));
      } else {
        callback();
      }
    };
    return {
      addEditForm: {
        btnSaveFontColor: "rgba(37, 35, 35, 0.68)",
        selectFontSize: "14px",
        btnCancelBorderColor: "rgba(238, 237, 229, 0.33)",
        inputBorderRadius: "20px",
        inputFontSize: "14px",
        textareaBgColor: "#fff",
        btnSaveFontSize: "14px",
        textareaBorderRadius: "20px",
        uploadBgColor: "#fff",
        textareaBorderStyle: "solid",
        btnCancelWidth: "88px",
        textareaHeight: "120px",
        dateBgColor: "#fff",
        btnSaveBorderRadius: "20px",
        uploadLableFontSize: "14px",
        textareaBorderWidth: "1px",
        inputLableColor: "rgba(52, 51, 50, 0.88)",
        addEditBoxColor: "rgba(232, 212, 212, 0.24)",
        dateIconFontSize: "14px",
        btnSaveBgColor: "#409EFF",
        uploadIconFontColor: "#8c939d",
        textareaBorderColor: "#DCDFE6",
        btnCancelBgColor: "rgba(231, 242, 112, 0.92)",
        selectLableColor: "#606266",
        btnSaveBorderStyle: "solid",
        dateBorderWidth: "1px",
        dateLableFontSize: "14px",
        dateBorderRadius: "20px",
        btnCancelBorderStyle: "solid",
        selectLableFontSize: "14px",
        selectBorderStyle: "solid",
        selectIconFontColor: "#C0C4CC",
        btnCancelHeight: "44px",
        inputHeight: "40px",
        btnCancelFontColor: "#606266",
        dateBorderColor: "#DCDFE6",
        dateIconFontColor: "#C0C4CC",
        uploadBorderStyle: "solid",
        dateBorderStyle: "solid",
        dateLableColor: "#606266",
        dateFontSize: "14px",
        inputBorderWidth: "1px",
        uploadIconFontSize: "28px",
        selectHeight: "40px",
        inputFontColor: "#606266",
        uploadHeight: "148px",
        textareaLableColor: "#606266",
        textareaLableFontSize: "14px",
        btnCancelFontSize: "14px",
        inputBorderStyle: "solid",
        btnCancelBorderRadius: "20px",
        inputBgColor: "#fff",
        inputLableFontSize: "14px",
        uploadLableColor: "#606266",
        uploadBorderRadius: "20px",
        btnSaveHeight: "44px",
        selectBgColor: "#fff",
        btnSaveWidth: "88px",
        selectIconFontSize: "14px",
        dateHeight: "40px",
        selectBorderColor: "#DCDFE6",
        inputBorderColor: "#DCDFE6",
        uploadBorderColor: "#DCDFE6",
        textareaFontColor: "#606266",
        selectBorderWidth: "1px",
        dateFontColor: "rgba(159, 111, 85, 0.88)",
        btnCancelBorderWidth: "1px",
        uploadBorderWidth: "1px",
        textareaFontSize: "14px",
        selectBorderRadius: "20px",
        selectFontColor: "#606266",
        btnSaveBorderColor: "#409EFF",
        btnSaveBorderWidth: "1px",
      },
      id: "",
      type: "",
      ro: {
        mingcheng: false,
        gonghao: false,
        xingming: false,
        bumen: false,
        zhiwei: false,
        jibengongzi: false,
        jiabangongzi: false,
        fuli: false,
        shebao: false,
        koufei: false,
        shifagongzi: false,
        riqi: false,
      },
      ruleForm: {
        mingcheng: "",
        gonghao: "",
        xingming: "",
        bumen: "",
        zhiwei: "",
        jibengongzi: "",
        jiabangongzi: "",
        fuli: "",
        shebao: "",
        koufei: "",
        shifagongzi: "",
        riqi: "",
      },
      rules: {
        mingcheng: [
          { required: true, message: "名称不能为空", trigger: "blur" },
        ],
        gonghao: [],
        xingming: [],
        bumen: [],
        zhiwei: [],
        jibengongzi: [
          { required: true, message: "基本工资不能为空", trigger: "blur" },
          { validator: validateIntNumber, trigger: "blur" },
        ],
        jiabangongzi: [
          { required: true, message: "加班工资不能为空", trigger: "blur" },
          { validator: validateIntNumber, trigger: "blur" },
        ],
        fuli: [
          { required: true, message: "福利不能为空", trigger: "blur" },
          { validator: validateIntNumber, trigger: "blur" },
        ],
        shebao: [
          { required: true, message: "社保不能为空", trigger: "blur" },
          { validator: validateIntNumber, trigger: "blur" },
        ],
        koufei: [
          { required: true, message: "扣费不能为空", trigger: "blur" },
          { validator: validateIntNumber, trigger: "blur" },
        ],
        shifagongzi: [
          { required: true, message: "实发工资不能为空", trigger: "blur" },
          { validator: validateIntNumber, trigger: "blur" },
        ],
        riqi: [],
      },
    };
  },
  props: ["parent"],
  computed: {
    shifagongzi: {
      get: function () {
        return (
          0 +
            parseFloat(
              this.ruleForm.jibengongzi == "" ? 0 : this.ruleForm.jibengongzi
            ) +
            parseFloat(
              this.ruleForm.jiabangongzi == "" ? 0 : this.ruleForm.jiabangongzi
            ) +
            parseFloat(this.ruleForm.fuli == "" ? 0 : this.ruleForm.fuli) -
            parseFloat(this.ruleForm.shebao == "" ? 0 : this.ruleForm.shebao) -
            parseFloat(this.ruleForm.koufei == "" ? 0 : this.ruleForm.koufei) ||
          0
        );
      },
    },
  },
  created() {
    this.addEditStyleChange();
    this.addEditUploadStyleChange();
  },
  methods: {
    // 下载
    download(file) {
      window.open(`${file}`);
    },
    // 初始化
    init(id, type) {
      if (id) {
        this.id = id;
        this.type = type;
      }
      if (this.type == "info" || this.type == "else") {
        this.info(id);
      } else if (this.type == "cross") {
        var obj = this.$storage.getObj("crossObj");
        for (var o in obj) {
          if (o == "mingcheng") {
            this.ruleForm.mingcheng = obj[o];
            this.ro.mingcheng = true;
            continue;
          }
          if (o == "gonghao") {
            this.ruleForm.gonghao = obj[o];
            this.ro.gonghao = true;
            continue;
          }
          if (o == "xingming") {
            this.ruleForm.xingming = obj[o];
            this.ro.xingming = true;
            continue;
          }
          if (o == "bumen") {
            this.ruleForm.bumen = obj[o];
            this.ro.bumen = true;
            continue;
          }
          if (o == "zhiwei") {
            this.ruleForm.zhiwei = obj[o];
            this.ro.zhiwei = true;
            continue;
          }
          if (o == "jibengongzi") {
            this.ruleForm.jibengongzi = obj[o];
            this.ro.jibengongzi = true;
            continue;
          }
          if (o == "jiabangongzi") {
            this.ruleForm.jiabangongzi = obj[o];
            this.ro.jiabangongzi = true;
            continue;
          }
          if (o == "fuli") {
            this.ruleForm.fuli = obj[o];
            this.ro.fuli = true;
            continue;
          }
          if (o == "shebao") {
            this.ruleForm.shebao = obj[o];
            this.ro.shebao = true;
            continue;
          }
          if (o == "koufei") {
            this.ruleForm.koufei = obj[o];
            this.ro.koufei = true;
            continue;
          }
          if (o == "shifagongzi") {
            this.ruleForm.shifagongzi = obj[o];
            this.ro.shifagongzi = true;
            continue;
          }
          if (o == "riqi") {
            this.ruleForm.riqi = obj[o];
            this.ro.riqi = true;
            continue;
          }
        }
      }
      // 获取用户信息
      this.$http({
        url: `${this.$storage.get("sessionTable")}/session`,
        method: "get",
      }).then(({ data }) => {
        if (data && data.code === 0) {
          var json = data.data;
        } else {
          this.$message.error(data.msg);
        }
      });
    },
    // 多级联动参数
    info(id) {
      this.$http({
        url: `gongzixinxi/info/${id}`,
        method: "get",
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.ruleForm = data.data;
          //解决前台上传图片后台不显示的问题
          let reg = new RegExp("../../../upload", "g"); //g代表全部
        } else {
          this.$message.error(data.msg);
        }
      });
    },
    // 提交
    onSubmit() {
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      this.ruleForm.shifagongzi = this.shifagongzi;
      // ${column.compare}

      this.$refs["ruleForm"].validate((valid) => {
        if (valid) {
          this.$http({
            url: `gongzixinxi/${!this.ruleForm.id ? "save" : "update"}`,
            method: "post",
            data: this.ruleForm,
          }).then(({ data }) => {
            if (data && data.code === 0) {
              this.$message({
                message: "操作成功",
                type: "success",
                duration: 1500,
                onClose: () => {
                  this.parent.showFlag = true;
                  this.parent.addOrUpdateFlag = false;
                  this.parent.gongzixinxiCrossAddOrUpdateFlag = false;
                  this.parent.search();
                  this.parent.contentStyleChange();
                },
              });
            } else {
              this.$message.error(data.msg);
            }
          });
        }
      });
    },
    // 获取uuid
    getUUID() {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.gongzixinxiCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
    addEditStyleChange() {
      this.$nextTick(() => {
        // input
        document
          .querySelectorAll(".addEdit-block .input .el-input__inner")
          .forEach((el) => {
            el.style.height = this.addEditForm.inputHeight;
            el.style.color = this.addEditForm.inputFontColor;
            el.style.fontSize = this.addEditForm.inputFontSize;
            el.style.borderWidth = this.addEditForm.inputBorderWidth;
            el.style.borderStyle = this.addEditForm.inputBorderStyle;
            el.style.borderColor = this.addEditForm.inputBorderColor;
            el.style.borderRadius = this.addEditForm.inputBorderRadius;
            el.style.backgroundColor = this.addEditForm.inputBgColor;
          });
        document
          .querySelectorAll(".addEdit-block .input .el-form-item__label")
          .forEach((el) => {
            el.style.lineHeight = this.addEditForm.inputHeight;
            el.style.color = this.addEditForm.inputLableColor;
            el.style.fontSize = this.addEditForm.inputLableFontSize;
          });
        // select
        document
          .querySelectorAll(".addEdit-block .select .el-input__inner")
          .forEach((el) => {
            el.style.height = this.addEditForm.selectHeight;
            el.style.color = this.addEditForm.selectFontColor;
            el.style.fontSize = this.addEditForm.selectFontSize;
            el.style.borderWidth = this.addEditForm.selectBorderWidth;
            el.style.borderStyle = this.addEditForm.selectBorderStyle;
            el.style.borderColor = this.addEditForm.selectBorderColor;
            el.style.borderRadius = this.addEditForm.selectBorderRadius;
            el.style.backgroundColor = this.addEditForm.selectBgColor;
          });
        document
          .querySelectorAll(".addEdit-block .select .el-form-item__label")
          .forEach((el) => {
            el.style.lineHeight = this.addEditForm.selectHeight;
            el.style.color = this.addEditForm.selectLableColor;
            el.style.fontSize = this.addEditForm.selectLableFontSize;
          });
        document
          .querySelectorAll(".addEdit-block .select .el-select__caret")
          .forEach((el) => {
            el.style.color = this.addEditForm.selectIconFontColor;
            el.style.fontSize = this.addEditForm.selectIconFontSize;
          });
        // date
        document
          .querySelectorAll(".addEdit-block .date .el-input__inner")
          .forEach((el) => {
            el.style.height = this.addEditForm.dateHeight;
            el.style.color = this.addEditForm.dateFontColor;
            el.style.fontSize = this.addEditForm.dateFontSize;
            el.style.borderWidth = this.addEditForm.dateBorderWidth;
            el.style.borderStyle = this.addEditForm.dateBorderStyle;
            el.style.borderColor = this.addEditForm.dateBorderColor;
            el.style.borderRadius = this.addEditForm.dateBorderRadius;
            el.style.backgroundColor = this.addEditForm.dateBgColor;
          });
        document
          .querySelectorAll(".addEdit-block .date .el-form-item__label")
          .forEach((el) => {
            el.style.lineHeight = this.addEditForm.dateHeight;
            el.style.color = this.addEditForm.dateLableColor;
            el.style.fontSize = this.addEditForm.dateLableFontSize;
          });
        document
          .querySelectorAll(".addEdit-block .date .el-input__icon")
          .forEach((el) => {
            el.style.color = this.addEditForm.dateIconFontColor;
            el.style.fontSize = this.addEditForm.dateIconFontSize;
            el.style.lineHeight = this.addEditForm.dateHeight;
          });
        // upload
        let iconLineHeight =
          parseInt(this.addEditForm.uploadHeight) -
          parseInt(this.addEditForm.uploadBorderWidth) * 2 +
          "px";
        document
          .querySelectorAll(".addEdit-block .upload .el-upload--picture-card")
          .forEach((el) => {
            el.style.width = this.addEditForm.uploadHeight;
            el.style.height = this.addEditForm.uploadHeight;
            el.style.borderWidth = this.addEditForm.uploadBorderWidth;
            el.style.borderStyle = this.addEditForm.uploadBorderStyle;
            el.style.borderColor = this.addEditForm.uploadBorderColor;
            el.style.borderRadius = this.addEditForm.uploadBorderRadius;
            el.style.backgroundColor = this.addEditForm.uploadBgColor;
          });
        document
          .querySelectorAll(".addEdit-block .upload .el-form-item__label")
          .forEach((el) => {
            el.style.lineHeight = this.addEditForm.uploadHeight;
            el.style.color = this.addEditForm.uploadLableColor;
            el.style.fontSize = this.addEditForm.uploadLableFontSize;
          });
        document
          .querySelectorAll(".addEdit-block .upload .el-icon-plus")
          .forEach((el) => {
            el.style.color = this.addEditForm.uploadIconFontColor;
            el.style.fontSize = this.addEditForm.uploadIconFontSize;
            el.style.lineHeight = iconLineHeight;
            el.style.display = "block";
          });
        // 多文本输入框
        document
          .querySelectorAll(".addEdit-block .textarea .el-textarea__inner")
          .forEach((el) => {
            el.style.height = this.addEditForm.textareaHeight;
            el.style.color = this.addEditForm.textareaFontColor;
            el.style.fontSize = this.addEditForm.textareaFontSize;
            el.style.borderWidth = this.addEditForm.textareaBorderWidth;
            el.style.borderStyle = this.addEditForm.textareaBorderStyle;
            el.style.borderColor = this.addEditForm.textareaBorderColor;
            el.style.borderRadius = this.addEditForm.textareaBorderRadius;
            el.style.backgroundColor = this.addEditForm.textareaBgColor;
          });
        document
          .querySelectorAll(".addEdit-block .textarea .el-form-item__label")
          .forEach((el) => {
            // el.style.lineHeight = this.addEditForm.textareaHeight
            el.style.color = this.addEditForm.textareaLableColor;
            el.style.fontSize = this.addEditForm.textareaLableFontSize;
          });
        // 保存
        document
          .querySelectorAll(".addEdit-block .btn .btn-success")
          .forEach((el) => {
            el.style.width = this.addEditForm.btnSaveWidth;
            el.style.height = this.addEditForm.btnSaveHeight;
            el.style.color = this.addEditForm.btnSaveFontColor;
            el.style.fontSize = this.addEditForm.btnSaveFontSize;
            el.style.borderWidth = this.addEditForm.btnSaveBorderWidth;
            el.style.borderStyle = this.addEditForm.btnSaveBorderStyle;
            el.style.borderColor = this.addEditForm.btnSaveBorderColor;
            el.style.borderRadius = this.addEditForm.btnSaveBorderRadius;
            el.style.backgroundColor = this.addEditForm.btnSaveBgColor;
          });
        // 返回
        document
          .querySelectorAll(".addEdit-block .btn .btn-close")
          .forEach((el) => {
            el.style.width = this.addEditForm.btnCancelWidth;
            el.style.height = this.addEditForm.btnCancelHeight;
            el.style.color = this.addEditForm.btnCancelFontColor;
            el.style.fontSize = this.addEditForm.btnCancelFontSize;
            el.style.borderWidth = this.addEditForm.btnCancelBorderWidth;
            el.style.borderStyle = this.addEditForm.btnCancelBorderStyle;
            el.style.borderColor = this.addEditForm.btnCancelBorderColor;
            el.style.borderRadius = this.addEditForm.btnCancelBorderRadius;
            el.style.backgroundColor = this.addEditForm.btnCancelBgColor;
          });
      });
    },
    addEditUploadStyleChange() {
      this.$nextTick(() => {
        document
          .querySelectorAll(
            ".addEdit-block .upload .el-upload-list--picture-card .el-upload-list__item"
          )
          .forEach((el) => {
            el.style.width = this.addEditForm.uploadHeight;
            el.style.height = this.addEditForm.uploadHeight;
            el.style.borderWidth = this.addEditForm.uploadBorderWidth;
            el.style.borderStyle = this.addEditForm.uploadBorderStyle;
            el.style.borderColor = this.addEditForm.uploadBorderColor;
            el.style.borderRadius = this.addEditForm.uploadBorderRadius;
            el.style.backgroundColor = this.addEditForm.uploadBgColor;
          });
      });
    },
  },
};
</script>
<style lang="scss">
.editor {
  height: 500px;

  & ::v-deep .ql-container {
    height: 310px;
  }
}
.amap-wrapper {
  width: 100%;
  height: 500px;
}
.search-box {
  position: absolute;
}
.addEdit-block {
  margin: -10px;
}
.detail-form-content {
  padding: 12px;
}
.btn .el-button {
  padding: 0;
}
</style>
