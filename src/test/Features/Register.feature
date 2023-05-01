Feature: Signup
  Scenario Outline: Successful signup with valid credentials
    Given user clicks on the signup button
    Then user enters the fullname as "karthikgangidi"
    And user enters the email as "<email>" and Password as "<Password>>"
    Then user click on signup button

    Examples:
      | email | Password |
    |karthikgangidi@gmail.com| Welcome123|
