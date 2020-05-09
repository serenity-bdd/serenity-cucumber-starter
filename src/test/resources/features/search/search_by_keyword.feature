Feature: Search by keyword

  Scenario: Searching for a term
    Given Sergey is researching things on the internet
    When he searches for "cucumber"
    Then the results should be about "cucumber"

