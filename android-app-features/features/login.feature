Feature: iEat Login Feature

	Scenario: I can login into iEat
		Given I am on the "登陆" page
		Then I enter text "qinyu" into field with id "input-data" in the page
			And I enter text "00000000" into field with id "input-password" in the page
			And I press the "登陆" button in the page
			And I wait for current page refresh
		Then I should go to "饭团列表" page
