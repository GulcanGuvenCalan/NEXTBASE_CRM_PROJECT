
Feature:NextBaseCrm app login feature
  User Story
  As a user, I should be able to create a poll by clicking on Poll tab under Active Stream.

  Accounts are:HR,Help desk,market

  Background:login page
    Given user is on the login page

  Scenario Outline:NextBaseCrm app login feature
  When user enters "<username>" in the username input box
  And user enters  "<password>" in the password input box
  Then user clicks the Log In  button


      Examples:username and password credentials
        | username                      | password |
        | helpdesk1@cybertekschool.com  | UserUser |
        | helpdesk2@cybertekschool.com  | UserUser |
        | helpdesk99@cybertekschool.com | UserUser |
        | hr1@cybertekschool.com        | UserUser |
        | hr2@cybertekschool.com        | UserUser |
        | hr99@cybertekschool.com       | UserUser |
        | marketing1@cybertekschool.com | UserUser |
        | marketing2@cybertekschool.com | UserUser |






