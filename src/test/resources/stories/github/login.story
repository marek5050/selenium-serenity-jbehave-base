Narrative: User goes on to github to search for jbehave!

Scenario: The user opens up the main page and searches for crossfit.social
Meta:
@id scenario1
@categories category2

Given the user accesses the github landing page
When when they login as user
And search for jbehave-social-media
Then we should see jbehave-social-media
And we should be on the main gitrepo page
Then click the star