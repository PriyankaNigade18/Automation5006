@All
Feature: Test Opencart application

  @Register @Regression
  Scenario: Test the Registration process for new user
    Given Open Register page with url "https://tutorialsninja.com/demo/index.php?route=account/register"
    When User enters required entries
      | fname | lname  | emailId           | tele       | pwd     | cpwd    |
      | Sumit | sharma | sumit11@gmail.com | 9877665554 | test123 | test123 |
    When User click on yes Newsletter
    When User check the privacy policy option
    When User click on continue button
    Then User User should be able to register

  @Login @Regression
  Scenario: Test the login functionality for registerd user
    Given Open application with url "https://tutorialsninja.com/demo/index.php?route=account/login"
    When user enters credentials
      | email             | pwd     |
      | sumit11@gmail.com | test123 |
    When User click on Cart Login button
    Then User should able to login into application
