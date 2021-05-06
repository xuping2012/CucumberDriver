@Regression
Feature: baidu search txt
Description: test search function
@Test
Scenario: test function is success
Given open the browser again
And input "上下文测试" and click btn
Then close browser again