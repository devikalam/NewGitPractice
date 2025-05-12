Feature:Register
@Smoke @Regression
Scenario: user should be able to register

Given Browser is open
And URL is navigated
When user enters valid credentials
| M | Tests | ManualTests | manulas@gmail.com| Password@123|
| M | Tests | ManualTests12 | manulas124@gmail.com| Password@123|

And  Clicks on Register button
Then  New account is created
And Browser is closed

