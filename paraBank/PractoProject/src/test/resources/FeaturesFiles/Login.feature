Feature: Login with valid credentials and invalid credentials
Scenario: verify successful login
	Given Launched application
	When Username and password is Entered and click on login button
	Then verify successful login or not 

Scenario: Capture error message
	Given Launched application url
	When Invaild username and password is Entered and click on login button
	Then verify get error message
	
Scenario: Create new account and validate new account number
	Given Launched login account url
	When Click on open ac button and choose ac type and select existing ac number
	Then Should get a success message for ac creation
	And validate new account number
	
Scenario: Transfer funds from one account to another
	Given Launched login url
	When click on transfer button and enter amount and select from account no to to account no
	Then click on transfer button get transfer complete
