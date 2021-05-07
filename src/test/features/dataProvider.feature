@Regression
Feature: Automated End2End Tests
Description: The purpose of this feature is to test End 2 End integration.
@DataProvider
Scenario Outline: Customer place an order by purchasing an item from search 
 Given user is on Home Page
 When enter "<customer>" personal details on checkout page
 And select same delivery address
 And select payment method as "check" payment
 And place the order
Examples:
 |customer|
 |Lakshay|