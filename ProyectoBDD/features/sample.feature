# Desarrollando escenarios
	Feature: Test Facebook smoke scenario
	
		Scenario: Test login with valid credentials
				Given open Firefox and start aplication
				When I enter valid username and valid password
				Then user should be able to login succesfully