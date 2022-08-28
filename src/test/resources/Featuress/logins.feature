Feature: This is for validate login funtionality

@Lap
Scenario: Verify user login sucessfully
Given Launch "<URL>" for demo
Then Click LoginLink
Then Enter username and password and click Login Button
Then Verify user login sucessfully profile page


@Lap
Scenario: Verify user logout sucessfully
Given Launch "<URL>" for demo
Then Click LoginLink
Then Enter username and password and click Login Button
Then User click logout link
Then Verify user logout sucessfully profile page

@Lap
Scenario: Verify user login unsucessfully with wrong credentials
Given Launch "<URL>" for demo
Then Click LoginLink
Then Enter username and click Login Button
Then Verify user login unsucessfull