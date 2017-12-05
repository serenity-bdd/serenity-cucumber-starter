Feature: Directory search

  Scenario: No matching user found
    Given there are no users called 'Boaty McBoatFace'
    When Joe searches for 'Boaty McBoatFace'
    Then he should be told that no matching users exist