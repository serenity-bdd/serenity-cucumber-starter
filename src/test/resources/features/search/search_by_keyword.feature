Feature: Search by keyword

  @green
  Scenario: Searching for 'green'
    Given Sergey is researching things on the internet
    When he looks up "green"
    Then he should see information about "green"

  @red
  Scenario: Searching for 'red'
    Given Sergey is researching things on the internet
    When he looks up "red"
    Then he should see information about "red"

  @blue
  Scenario: Searching for 'blue'
    Given Sergey is researching things on the internet
    When he looks up "blue"
    Then he should see information about "blue"
