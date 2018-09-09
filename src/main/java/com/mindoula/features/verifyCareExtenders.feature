Feature: Verify Care Extender Details

Scenario: Verify different labels in Login Page
Given User navigates to Login Page
Then user enters login credentials

@TestVerifyCareExtender
Scenario: Verify different labels in Login Page
Then user clicks on Mega Menu
Then user clicks on careExtenders
Then Verify data on CareExtenders
	| email |
	|harishtadika@gmail.com|
	|narsi@mindoula.com|