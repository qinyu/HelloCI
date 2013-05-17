Feature: Main Activity screen

  Scenario: I can see button and text on Main Actvivity
    Then I wait for the "MainActivity" screen to appear
    Then I see "Hello World, MainActivity"
    Then I see button with text "test"
    Then take picture

