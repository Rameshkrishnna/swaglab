
Feature: Login with diffrent username and password
  I want to check login page with diffrent credentials

  Scenario: Login the application
    Given User is on login page
    When User login the application with <username> and <password>
    Then I verify the user able to login

    Examples: 
      | username  | password 	|
      | name1 		|     5 		| 
      | name2 		|     7 		| 
