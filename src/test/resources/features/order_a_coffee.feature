Feature: Order a coffee

  Scenario: Order a cappuccino
    Given I am thirsty
    When I order a cappuccino
    Then I should not receive a latte