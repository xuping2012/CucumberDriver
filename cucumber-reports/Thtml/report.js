$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("dataProvider.feature");
formatter.feature({
  "line": 2,
  "name": "Automated End2End Tests",
  "description": "Description: The purpose of this feature is to test End 2 End integration.",
  "id": "automated-end2end-tests",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Customer place an order by purchasing an item from search",
  "description": "",
  "id": "automated-end2end-tests;customer-place-an-order-by-purchasing-an-item-from-search",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@DataProvider"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "enter \"\u003ccustomer\u003e\" personal details on checkout page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "select same delivery address",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "select payment method as \"check\" payment",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "place the order",
  "keyword": "And "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "automated-end2end-tests;customer-place-an-order-by-purchasing-an-item-from-search;",
  "rows": [
    {
      "cells": [
        "customer"
      ],
      "line": 12,
      "id": "automated-end2end-tests;customer-place-an-order-by-purchasing-an-item-from-search;;1"
    },
    {
      "cells": [
        "Lakshay"
      ],
      "line": 13,
      "id": "automated-end2end-tests;customer-place-an-order-by-purchasing-an-item-from-search;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2097286400,
  "status": "passed"
});
formatter.before({
  "duration": 21600,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Customer place an order by purchasing an item from search",
  "description": "",
  "id": "automated-end2end-tests;customer-place-an-order-by-purchasing-an-item-from-search;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@DataProvider"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "enter \"Lakshay\" personal details on checkout page",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "select same delivery address",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "select payment method as \"check\" payment",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "place the order",
  "keyword": "And "
});
formatter.match({
  "location": "DataProvider.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 70097600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lakshay",
      "offset": 7
    }
  ],
  "location": "DataProvider.enter_personal_details_on_checkout_page(String)"
});
formatter.result({
  "duration": 35855000,
  "error_message": "java.lang.NullPointerException\r\n\tat stepdefinition.DataProvider.enter_personal_details_on_checkout_page(DataProvider.java:41)\r\n\tat ✽.When enter \"Lakshay\" personal details on checkout page(dataProvider.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "DataProvider.select_same_delivery_address()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "check",
      "offset": 26
    }
  ],
  "location": "DataProvider.select_payment_method_as_payment(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DataProvider.place_the_order()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 260867600,
  "status": "passed"
});
formatter.after({
  "duration": 643338000,
  "status": "passed"
});
});