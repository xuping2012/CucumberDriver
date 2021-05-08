$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("chineseTest.feature");
formatter.feature({
  "line": 2,
  "name": "test system login",
  "description": "",
  "id": "test-system-login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 2452294800,
  "status": "passed"
});
formatter.before({
  "duration": 21600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "login successful",
  "description": "",
  "id": "test-system-login;login-successful",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Chinese"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "open system",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "enter string",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click btn",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "toast a",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 163000,
  "status": "passed"
});
formatter.after({
  "duration": 619754800,
  "status": "passed"
});
});