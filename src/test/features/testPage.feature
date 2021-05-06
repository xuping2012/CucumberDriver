@Regression
Feature: must be having
@Passwd
Scenario: Verify Updating user password feature
Given I am in the HR system with "Admin" account
And there is another user with "$Test123" password
When I update password of the user to "@Test123"
Then I got the message "Password changed successfully."
And the user password should be "@Test123"