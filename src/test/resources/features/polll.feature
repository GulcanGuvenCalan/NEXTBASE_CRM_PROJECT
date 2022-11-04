@NEXTBASE-1443
Feature: Default


	#Verify Employee and department contact list
	@NEXTBASE-1458
		Scenario:Verify Employee and department contact list
		 Given user is already  logged in the homepage page
		    When user clicks the poll button
		    And user clicks the add more button
		    And user clicks the Employees and Departments button
		    And user clicks the helpdesk22@cybertekschool.com button
		    And user clicks the hr76@cybertekschool.com button
		    And user clicks the marketing4@cybertekschool.com button
		    Then user should see "helpdesk22@cybertekschool.com", "<hr76@cybertekschool.com>" and "<marketing4@cybertekschool.com>" in the To container	

	#Verify add questions and multiple answers input boxes
	@NEXTBASE-1459
	Scenario: US07_As a user, I should be able to create a poll by clicking on Poll tab under Active Stream.
		Given user is already  logged in the homepage page
		 When user clicks the poll button
		    And  user clicks the Add question link
		    And  user clicks the Add question link again
		    Then user should see default question	

	#Verify delete questions and multiple answers input boxes
	@NEXTBASE-1460
	Scenario: US07_As a user, I should be able to create a poll by clicking on Poll tab under Active Stream.
		Given user is already  logged in the homepage page
		 When user clicks the poll button
		    And  user clicks the Add question link
		    And  user clicks the Add question link again
		    Then user deletes the questions and answers	

	#Verify the Allow multiple choice checkbox
	@NEXTBASE-1461
	Scenario: US07_As a user, I should be able to create a poll by clicking on Poll tab under Active Stream.
		Given user is already  logged in the homepage page
		 When user clicks the poll button
		  And  user clicks the Allow multiple choice input
		  And user should see The Allow multiple choice label	

	#User should be able create a poll with mandatory fields( Message title, recipient, 1 question, 2 answers )
	@NEXTBASE-1462
	Scenario: US07_As a user, I should be able to create a poll by clicking on Poll tab under Active Stream.
		Given user is already  logged in the homepage page
		When user clicks the poll button
		    And user clicks the add more button
		    And user clicks the Employees and Departments button
		    And user clicks the helpdesk22@cybertekschool.com button
		    And user click the popup-window-close-icon
		    And  user types information in the default question
		    And user types information  in the first default answer
		    And user types information  in the second default answer
		    And user clicks send button
		    Then user should see The message title is not specified error message	

	#User should be able create a poll with mandatory fields( Message title, recipient, 1 question, 2 answers )
	@NEXTBASE-1463
	Scenario: US07_As a user, I should be able to create a poll by clicking on Poll tab under Active Stream.
		Given user is already  logged in the homepage page
		 When user clicks the poll button
		    And user types information in the title
		    And user clicks the delete All employees button
		    And  user types information in the default question
		    And user types information  in the first default answer
		    And user types information  in the second default answer
		    And user clicks send button
		    Then user should see Please specify at least one person. Error message	

	#User should be able create a poll with mandatory fields( Message title, recipient, 1 question, 2 answers )
	@NEXTBASE-1464
	Scenario: US07_As a user, I should be able to create a poll by clicking on Poll tab under Active Stream.
		Given user is already  logged in the homepage page
		When user clicks the poll button
		    And user types information in the title
		    And user types information  in the first default answer
		    And user types information  in the second default answer
		    And user clicks send button
		    Then user should see   The question text is not specified. Error message	

	#User should be able create a poll with mandatory fields( Message title, recipient, 1 question, 2 answers )
	@NEXTBASE-1465
	Scenario: US07_As a user, I should be able to create a poll by clicking on Poll tab under Active Stream.
		Given user is already  logged in the homepage page
		 When user clicks the poll button
		    And user types information in the title
		    And  user types "ABC"  in the default question
		    And user clicks send button
		    Then user should see The question "ABC" has no answers. Error message	

	#:User should be able create a poll with mandatory fields( Message title, recipient, 1 question, 2 answers )
	@NEXTBASE-1466
	Scenario: US07_As a user, I should be able to create a poll by clicking on Poll tab under Active Stream.
		Given user is already  logged in the homepage page
		When user clicks the poll button
		    And user types information in the title
		    And  user types information in the default question
		    And user types information  in the first default answer
		    And user clicks send button
		    Then user should see Please specify at least two answers. Error message