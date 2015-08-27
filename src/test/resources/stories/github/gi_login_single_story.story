Narrative: User goes on to github to search for jbehave!

Scenario: The user finds a very good example called jbehave-social-media and clicks on it. They love it and star it!
Meta:
@id scenario1
@categories category2

Given the user accesses the github landing page
When when they login as user
And search for jbehave-social-example
Then we should see jbehave-social-example
And we should be on the main gitrepo page
Then click the star