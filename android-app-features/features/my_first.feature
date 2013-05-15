Feature: Start app

  Scenario: As a valid user I can start my app
    When I start app
    Then I see "Hello World, MainActivity"
