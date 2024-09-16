Feature: Test CRM application

  Background: 
    Given Open CRM application with "https://automationplayground.com/crm"

  Scenario: Test for SignIn link
    When User click on SignIn link
    Then User should navigate to login page

  Scenario: Test for login with valid credentials
    When User navigated to login page
    When User enters valid emailid "test@gmail.com" and valid password "test123"
    And User click on submit button
    Then User should able to login and navigated to customers page
