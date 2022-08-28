Feature: Verify Categories Funtionality

@Lap
Scenario: Verify Laptop page display
Given Launch "<URL>" for demo
Then click laptopslink
Then Verify Laptops display


@Lap
Scenario: Verify AboutUslink display
Given Launch "<URL>" for demo
Then click AboutUslink and vdo play button
Then Verify AboutUsvdo display