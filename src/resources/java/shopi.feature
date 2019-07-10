Feature: Data driven testing
Scenario: Login using differrent credentials
Scenario Outline: login using below users
When login using <username> and <password>

Examples:
|username|password|
|user1|user2|
|user2|user3|
