Feature: Add Student
  As a professor
  I want to register students in the system
  So I can evaluate the students with respect to various criteria
  
#Controller Scenario
	Scenario: I add a student with name " "
	Given the student " " with login "Fa" is not registered in the system
	When I add the " " with login "Fa"
	Then the system does not register " " with login "Fa"
	

#GUI Scenario
   Scenario: Error when I add a student with name " "
	Given the student " " with login "Fa" is not registered in the system
	And I am in the "add student" page
    When I add the " " with login "Fa"
    Then I should see a message related to the student registration failure