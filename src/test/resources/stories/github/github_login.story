Meta:
@issue THEB-2

Narrative:
In order to view my favorite Github Repo
As a user
I want to login, search, and star it!

Scenario: The user finds a very good example called jbehave-social-media and clicks on it. They love it and star it!
Meta:
@id scenario1
@categories category2

Given the user accesses the github landing page
When when they login as user
And search for selenium-serenity-jbehave-base
Then we should see selenium-serenity-jbehave-base
And we should be on the main gitrepo page
Then click the star