Feature: Validating the login functionality in W3 Schools application

Scenario: Validating login with correct username and password

Given Navigate to w3 schools login page
When I enter the correct username
And I enter the correct password
Then Login should be successful

Scenario: Validating login with correct username and incorrect password

Given Navigate to w3 schools login page
When I enter the correct username
And I enter incorrect password
Then Login should be successful

Scenario: validating login with incorrect username and correct password

Given Navigate to w3 schools login page
When I enter the incorrect username
And I enter the correct password
Then Login should be successful