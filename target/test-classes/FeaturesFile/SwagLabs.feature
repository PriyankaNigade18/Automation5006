Feature: Test SwagLab application

  Background: 
    Given Open SwagLab application

  Scenario: Test for title of SWaglabs
    When User get the title of swaglab home page
    Then Title should matched with swaglab homepage title

  Scenario: Test for login functionality of SwagLab
    When User enter "standard_user" into username text box and "secret_sauce" into password
    And User click on swaglab login button
    Then User should able to navigate Inventory page
