Feature:Login
@Smoke
Scenario: Validate user is able to login using valid credentials

Given Browser is open and URL is navigated
And login page is displayed
When enter valid username and valid password 
And user clicks on login button
Then user should be susccesfully logged in
And browser should close
