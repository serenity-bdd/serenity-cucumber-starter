Feature: Search by keyword

  Scenario: Searching for a term
    Given Serena is researching things on the internet
    When she looks up "Cucumber"
    Then she should see information about "Cucumber"

