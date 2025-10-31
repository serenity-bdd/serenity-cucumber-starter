Feature: Search by keyword

  @green
  Scenario: Searching for 'fish'
    Given Sergey is researching things on the internet
    When he looks up "fish"
    Then he should see information about "fish"

  @red
  Scenario: Searching for 'dog'
    Given Sergey is researching things on the internet
    When he looks up "dog"
    Then he should see information about "dog"

  @blue
  Scenario: Searching for 'cat'
    Given Sergey is researching things on the internet
    When he looks up "cat"
    Then he should see information about "cat"
