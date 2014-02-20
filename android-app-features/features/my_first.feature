Feature: Main Activity screen

  Scenario: I can see on Spinner Activity
    Given I wait for the "MainActivity" screen to appear
    And I see "Spinner"
    When I touch the "Input View" text
    Then I wait for "ClearText" to appear

