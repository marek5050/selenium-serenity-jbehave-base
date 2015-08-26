Narrative: User logs in

Lifecycle:
After:
Outcome: FAILURE
Then notify the user of invalid credentials


Scenario: User attempts to login jdoe(jdoe)
Meta:
@id scenario1
@categories category2
@skip

Given the user accesses the twitter landing page
When they login as user
Then login should succeed
And there will be a tweet box
And write a message @marek5050 Hello !
Then send the tweet