
Scenario: I want to check if gmail.com is laoding


Given I open gmail.com
When I wait for some 10  milliseconds
Then gmail.com should load