const menu = {
  list() {
    return [
      {
        backMenu: [
          {
            child: [
              {
                buttons: ["新增", "查看", "修改", "删除"],
                menu: "用户",
                menuJump: "列表",
                tableName: "users",
              },
            ],
            menu: "用户管理",
          },
          {
            child: [
              {
                buttons: ["新增", "查看", "修改", "删除"],
                menu: "经理",
                menuJump: "列表",
                tableName: "manager",
              },
            ],
            menu: "经理管理",
          },
          {
            child: [
              {
                buttons: ["新增", "查看", "修改", "删除", "考勤", "工资"],
                menu: "员工",
                menuJump: "列表",
                tableName: "yuangong",
              },
            ],
            menu: "员工管理",
          },
        ],
        frontMenu: [],
        hasBackLogin: "是",
        hasBackRegister: "否",
        hasFrontLogin: "否",
        hasFrontRegister: "否",
        roleName: "管理员",
        tableName: "users",
      },
      {
        backMenu: [
          {
            child: [
              {
                buttons: ["查看"],
                menu: "部门信息",
                menuJump: "列表",
                tableName: "bumenxinxi",
              },
            ],
            menu: "部门信息管理",
          },
          {
            child: [
              {
                buttons: ["查看"],
                menu: "福利信息",
                menuJump: "列表",
                tableName: "fulixinxi",
              },
            ],
            menu: "福利信息管理",
          },
          {
            child: [
              {
                buttons: ["查看"],
                menu: "培训信息",
                menuJump: "列表",
                tableName: "peixunxinxi",
              },
            ],
            menu: "培训信息管理",
          },
          {
            child: [
              {
                buttons: ["查看"],
                menu: "任务信息",
                menuJump: "列表",
                tableName: "renwuxinxi",
              },
            ],
            menu: "任务信息管理",
          },
          {
            child: [
              {
                buttons: ["查看"],
                menu: "工资信息",
                menuJump: "列表",
                tableName: "gongzixinxi",
              },
            ],
            menu: "工资信息管理",
          },
          {
            child: [
              {
                buttons: ["查看"],
                menu: "考勤信息",
                menuJump: "列表",
                tableName: "kaoqinxinxi",
              },
            ],
            menu: "考勤信息管理",
          },
        ],
        frontMenu: [],
        hasBackLogin: "是",
        hasBackRegister: "否",
        hasFrontLogin: "是",
        hasFrontRegister: "是",
        roleName: "员工",
        tableName: "yuangong",
      },
      {
        backMenu: [
          {
            child: [
              {
                buttons: ["新增", "查看", "修改", "删除"],
                menu: "部门信息",
                menuJump: "列表",
                tableName: "bumenxinxi",
              },
            ],
            menu: "部门信息管理",
          },
          {
            child: [
              {
                buttons: ["新增", "查看", "修改", "删除"],
                menu: "职位信息",
                menuJump: "列表",
                tableName: "zhiweixinxi",
              },
            ],
            menu: "职位信息管理",
          },
          {
            child: [
              {
                buttons: ["新增", "查看", "修改", "删除"],
                menu: "福利信息",
                menuJump: "列表",
                tableName: "fulixinxi",
              },
            ],
            menu: "福利信息管理",
          },
          {
            child: [
              {
                buttons: ["新增", "查看", "修改", "删除"],
                menu: "培训信息",
                menuJump: "列表",
                tableName: "peixunxinxi",
              },
            ],
            menu: "培训信息管理",
          },
          {
            child: [
              {
                buttons: ["新增", "查看", "修改", "删除", "查看评论"],
                menu: "任务信息",
                menuJump: "列表",
                tableName: "renwuxinxi",
              },
            ],
            menu: "任务信息管理",
          },
          {
            child: [
              {
                buttons: ["新增", "查看", "修改", "删除", "打印", "导出"],
                menu: "工资信息",
                menuJump: "列表",
                tableName: "gongzixinxi",
              },
            ],
            menu: "工资信息管理",
          },
          {
            child: [
              {
                buttons: ["查看", "修改", "删除", "报表"],
                menu: "考勤信息",
                menuJump: "列表",
                tableName: "kaoqinxinxi",
              },
            ],
            menu: "考勤信息管理",
          },
          {
            child: [
              {
                buttons: ["新增", "查看", "修改", "删除", "报表"],
                menu: "招聘信息",
                menuJump: "列表",
                tableName: "zhaopinxinxi",
              },
            ],
            menu: "招聘信息管理",
          },
        ],
        frontMenu: [],
        hasBackLogin: "是",
        hasBackRegister: "否",
        hasFrontLogin: "否",
        hasFrontRegister: "否",
        roleName: "经理",
        tableName: "manager",
      },
    ];
  },
};
export default menu;
