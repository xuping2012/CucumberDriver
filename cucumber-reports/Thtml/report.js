$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("chineseTest.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: zh-CN"
    }
  ],
  "line": 3,
  "name": "测试系统登录",
  "description": "",
  "id": "测试系统登录",
  "keyword": "功能",
  "tags": [
    {
      "line": 2,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 1315695700,
  "status": "passed"
});
formatter.before({
  "duration": 19000,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "登录生成",
  "description": "",
  "id": "测试系统登录;登录生成",
  "type": "scenario",
  "keyword": "场景",
  "tags": [
    {
      "line": 4,
      "name": "@chinese"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "打开系统",
  "keyword": "假如"
});
formatter.step({
  "line": 7,
  "name": "输入用户名和密码",
  "keyword": "当"
});
formatter.step({
  "line": 8,
  "name": "点击登录",
  "keyword": "那么"
});
formatter.step({
  "line": 9,
  "name": "得到登录成功提示",
  "keyword": "那么"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});