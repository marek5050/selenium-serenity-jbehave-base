![Status](https://travis-ci.org/marek5050/selenium-serenity-jbehave-base.svg)
#Selenium/Serenity/JBehave base
JBehave stories that use Serenity PageObjects and Selenium web driver.

## To Run
For most fun and functionality modify the pom.xml with your credentials. Right now it supposed Twitter and Github.
The tests just send a simple "Hello" tweet and star this repo. There's also a Google test that doesn't require
any credentials for functionality. 

__mvn verify__  is all that's required to run the tests.  
* It will also generate a aggregated test report in target/serenity/index.html

## Changes
+ Integrate JIRA access via - Serenity-JIRA plugin
+ Integrated Saucelabs - [serenity.properties](https://github.com/marek5050/selenium-serenity-jbehave-base/blob/master/serenity.properties)  
    + Created a Saucelabs profile, now we can run Sauce Labs tests via mvn -Psauce verify
    + Run Firefox by default.
+ Integrated TravisCI - [.travis.yml](https://github.com/marek5050/selenium-serenity-jbehave-base/blob/master/.travis.yml)
+ Added alternative resources 
