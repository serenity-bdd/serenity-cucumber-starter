Feature: Search by keyword

#  Scenario: Searching for a term
#    Given Sergey is on the DuckDuckGo home page
#    When he searches for "cucumber"
#    Then all the result titles should contain the word "cucumber"

  Scenario Outline: Searching for term
    Given Sergey wants a <term>
    When he searches for "<term>"
    Then all the result titles should contain the word "<term>"
    Examples:
    | term |
    | cucumber |
    | gherkin |
