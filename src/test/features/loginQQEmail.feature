@Regression
Feature: Login
  Description: This feature will test Login functionality
  @Login
  Scenario: Successful Login with valid credentials
    Given User is on Login Page
    When User enters UserName and Password
    And Click Login button
    Then He can visit mail home page
    And Account name is displayed
    Then Click loginout link
    Then Account loginout appliction
    Then Close curret borwer