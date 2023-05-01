Feature: Login page feature

  Scenario: Forgot password link
    Given User clicks on sign in button
    Then Forgot password link should be displayed

  Scenario: Login with correct credentials
    Given User clicks on sign in button
    Then User enter Email as "karthikgangidi@gmail.com"
    And User enter Password as "Welcome123"
    Then User clicks on log in button



