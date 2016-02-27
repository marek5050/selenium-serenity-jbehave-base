Meta:
@tags twitter:1

Narrative:
In order to effectively use this framework
As a tester
I want to ensure it functions

Lifecycle:
After:
Outcome: FAILURE
Then notify the user of invalid credentials


Scenario: The user then attempts to login with valid / invalid credentials

Given the user accesses the twitter landing page
When they login as user
Then login should succeed
And there will be a tweet box
And write a message @marek5050 Hello !
Then send the tweet