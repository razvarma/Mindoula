Feature: Member Creation and Validation
@Login
Scenario: Login to the application
Given User navigates to Login Page
Then user enters login credentials

@CreateMember
Scenario: Create a new Member
Then user clicks on Mega Menu
Then user clicks on Members
Then click on Add Member
Then Enter data in Add Member Page
	| fname		| mname		|lname 	| email 	| mobile 	| dob | gender | race | address | home_phone | office_phone |
	| Harish 	| Sai		| tadi	| haarr.tt1@gmail.com | 5194983888 | 01/01/1980	 | Male | Asian | 1 Hampshire Rd, Akron OH | 509890987 | 5098954324-1234 |
	
#@VerifyMemberDetails
#Scenario: Verify Member Details
#Then user clicks on Mega Menu
#Then user clicks on Members
#Then Verify data on CareExtenders
#	| name |
#	|Harish|
#	|Narsi|	



