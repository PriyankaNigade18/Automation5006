Feature: Test Opencart application

  Scenario: Test the Registration process for new user
    Given Open Register page with url "https://tutorialsninja.com/demo/index.php?route=account/register"
    When User enters required entries
      | fname | lname  | emailId             | tele       | pwd     | cpwd    |
      | Sumit | sharma | sumit11@gmail.com | 9877665554 | test123 | test123 |
    When User click on yes Newsletter
    When User check the privacy policy option
    When User click on continue button
    Then User User should be able to register

  Scenario: Test the login functionality for registerd user
