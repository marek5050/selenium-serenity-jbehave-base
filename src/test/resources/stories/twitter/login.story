Narrative: User logs in

Scenario: User attempts to login jdoe(jdoe)
Meta:
@id scenario1
@categories category2
@skip

Given the user accesses the twitter landing page
When they login as marek5050 with snowTWhawk123$$!
Then login should succeed