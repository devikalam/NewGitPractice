Feature: ShopperStackLogin
@Smoke
Scenario: Validate Shopper can be login using valid credentials

Given Browser should open and URL is navigated
And login page should be displayed
And Shopper login is displayed
When Shopper enters "qa_testmerchantdell@gmail.com" and "Password@123"
And clicks on login button
Then shopper should be successfully logged
And Browser is close

@Smoke
Scenario: Validate Merchant can be login using valid credentials

Given Browser should open and URL is navigated
And login page should be displayed
And Merchant login is displayed
When Merchant enters "qa_merchantlogin@gmail.com" and "Password@123"
And clicks on login button
Then Merchant should be successfully logged
And Browser is close

@Smoke
Scenario: Validate Admin can be login using valid credentials

Given Browser should open and URL is navigated
And login page should be displayed
And Admin login is displayed
When Admin enters "qa_testadmindell@gmail.com" and "Password@123"
And clicks on login button
Then Admin should be successfully logged
And Browser is close




