Staring a repo on Github

Meta:
@issue THEB-2

Narrative:
In order to view my favorite Github Repo
As a user
I want to login, search, and star it!

Scenario: Github user searches and stars a repo.
Meta:
@id scenario1
@categories category2

Given the user accesses the github landing page
When when they login as user
And search for selenium-serenity-jbehave-base
Then we should see selenium-serenity-jbehave-base
Then click the star