Feature: Verify Care Extender Creation

@Login
Scenario: Login to the application
Given User navigates to Login Page
Then user enters login credentials

@CreateCareExtender
Scenario: Create a new Care Extender
Then user clicks on Mega Menu
Then user clicks on careExtenders
Then click on Create button
Then Enter data in CareExtenders Page
	| fname		| lname 	| email 	| mobile 	| Role_SuperAdmin | Role_Admin | Role_ProgAdmin | Role_ProgManager | Role_CaseManager | Role_Sych |
	| Harish 	| Tadi		| haarr.tt1@gmail.com | 5194983888 | No | No | No | No | No | No |
	
@VerifyCareExtender
Scenario: Create Care Extender Details
Then user clicks on Mega Menu
Then user clicks on careExtenders
Then Verify data on CareExtenders
	| email | name | phone | roles | active |
	|mary.kom@bd.com| Mary Kom | (673) 984-3939 | Program Manager,Case Manager | Yes |
	|narsi@mindoula.com| Care Extender_1 | 	(768) 788-8888 | Administrator,Program Manager | Yes |	



