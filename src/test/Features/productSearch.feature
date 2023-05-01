Feature: Search the product and add to cart

  Scenario Outline: : User enters the product and add to cart
    Given User clicks on sign in button
    Then User enter Email as "karthikgangidi@gmail.com"
    And User enter Password as "Welcome123"
    Then User clicks on log in button
    When User clicks on Shop now button
    Then User selects the '<product>'
    Then User clicks on the Add to cart button
    And User clicks on the basket


    Examples:
    |product|
    |Very Nice|









