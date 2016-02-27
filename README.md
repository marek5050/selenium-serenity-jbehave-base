![Status](https://travis-ci.org/marek5050/selenium-serenity-jbehave-base.svg)
#Selenium/Serenity/JBehave base
A framework skeleton for testing using Selenium/Serenity/JBehave.

[Selenium](http://www.seleniumhq.org/docs/index.jsp)  
[Serenity](http://thucydides.info/docs/serenity-staging/)  
[JBehave](http://jbehave.org/)  

## Serenity Report
[The report can be found on our Github Pages](http://marek5050.github.io/static/serenity/index.html)

## To Run
For most fun and functionality modify the pom.xml with your account stuff. Right now it supposed Twitter and Github.
The tests just send a simple "Hello" tweet and star this repo. There's also a Google test that doesn't require
any credentials.

__mvn verify__  is all that's required to run the tests via Firefox.  
__mvn -Psauce verify__ will run tests on Sauce Labs.  


* Will also generate an aggregated test report in target/serenity/index.html

## Changes
+ Integrate JIRA access via - Serenity-JIRA plugin
+ Integrated Saucelabs - [serenity.properties](https://github.com/marek5050/selenium-serenity-jbehave-base/blob/master/serenity.properties)  
    + Created a Saucelabs profile, now we can run Sauce Labs tests via mvn -Psauce verify
    + Run Firefox by default.
+ Integrated TravisCI - [.travis.yml](https://github.com/marek5050/selenium-serenity-jbehave-base/blob/master/.travis.yml)
+ Added alternative resources
