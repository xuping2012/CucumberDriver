$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("parameters.feature");
formatter.feature({
  "line": 2,
  "name": "Login Action",
  "description": "",
  "id": "login-action",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "id": "login-action;successful-login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Parameters"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Navigate to LogIn Page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "login-action;successful-login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10,
      "id": "login-action;successful-login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "testuser_1",
        "Test@153"
      ],
      "line": 11,
      "id": "login-action;successful-login-with-valid-credentials;;2"
    },
    {
      "cells": [
        "testuser_2",
        "Test@153"
      ],
      "line": 12,
      "id": "login-action;successful-login-with-valid-credentials;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1292495100,
  "status": "passed"
});
formatter.before({
  "duration": 3205200,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "id": "login-action;successful-login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    },
    {
      "line": 3,
      "name": "@Parameters"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Navigate to LogIn Page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters \"testuser_1\" and \"Test@153\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Parameters.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 62428800,
  "status": "passed"
});
formatter.match({
  "location": "Parameters.user_Navigate_to_LogIn_Page()"
});
formatter.result({
  "duration": 35400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testuser_1",
      "offset": 13
    },
    {
      "val": "Test@153",
      "offset": 30
    }
  ],
  "location": "Parameters.user_enters_and(String,String)"
});
formatter.result({
  "duration": 1318800,
  "status": "passed"
});
formatter.match({
  "location": "Parameters.message_displayed_Login_Successfully()"
});
formatter.result({
  "duration": 28900,
  "status": "passed"
});
formatter.after({
  "duration": 61700,
  "status": "passed"
});
formatter.after({
  "duration": 627635400,
  "status": "passed"
});
formatter.before({
  "duration": 1282756900,
  "status": "passed"
});
formatter.before({
  "duration": 61000,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "id": "login-action;successful-login-with-valid-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    },
    {
      "line": 3,
      "name": "@Parameters"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Navigate to LogIn Page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters \"testuser_2\" and \"Test@153\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Parameters.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 66400,
  "status": "passed"
});
formatter.match({
  "location": "Parameters.user_Navigate_to_LogIn_Page()"
});
formatter.result({
  "duration": 36000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testuser_2",
      "offset": 13
    },
    {
      "val": "Test@153",
      "offset": 30
    }
  ],
  "location": "Parameters.user_enters_and(String,String)"
});
formatter.result({
  "duration": 73400,
  "status": "passed"
});
formatter.match({
  "location": "Parameters.message_displayed_Login_Successfully()"
});
formatter.result({
  "duration": 28600,
  "status": "passed"
});
formatter.after({
  "duration": 33600,
  "status": "passed"
});
formatter.after({
  "duration": 643438600,
  "status": "passed"
});
});