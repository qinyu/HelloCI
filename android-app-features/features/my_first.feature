Feature: Main Activity screen

  Scenario: I can see EditText Activity
    Given I wait for the "MainActivity" screen to appear
    And I see "Input View"
    When I touch the "Input View" text
    Then I wait for "ClearText" to appear
