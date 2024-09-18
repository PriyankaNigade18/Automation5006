Feature: Test Hrm for datadriven

  Scenario Outline: Test Orangehrm for multiple datasets
    Given Open Hrm application
    When User enters "<username>" and enters "<password>"
    And User click on hrm login button
    Then As per valid data set user should be navigated to dashboard page

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | Kiran    | test123  |
      | Admin    | admin123 |
      | Smita    | test123  |
