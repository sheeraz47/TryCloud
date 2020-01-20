"@Login"
Feature: Login function
  user can login with different valid credentials


  Scenario: login with valid credentials
    Given user is on login page with username and password
    Then user verifies that the user on the home page
