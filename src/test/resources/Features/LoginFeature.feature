Feature: Orange HRM LogIn Funcationality
  Scenario:Verify the login using credentials
    Given Browser is Opened
    And User is on LogIn Page
    When User enters username and password
    Then User is navigated to Home Page
