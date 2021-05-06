@Regression
Feature: baidu search txt
Description: test search function
@Search
Scenario: test function is success
Given open baidu page
When input txt and click btn
Then close browser