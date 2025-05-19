Feature: Orange HRM LogIn Functionality
  Scenario:Verify the login using credentials
    Given Browser is Opened
    And User is on LogIn Page
    When User enters username and password
    Then User is navigated to Home Page
