Feature: LoginApp Function
Background: Browser Launch
Given Browser must be present in the system
When user opens the application in the browser
Then Testme opens in the browser

Scenario: Login Function
Given User must be already registered
When user enters the correct credentials
Then user must be in the home page

Scenario: Search product
Given User must have search option
When search for the product with name
Then searched product detail must be displayed in page

