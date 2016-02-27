package social.selenium.definitions;

import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import social.selenium.steps.twitterSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNot.not;

/**
 * Created by marek5050 on 2/25/16.
 */
public class twitterDefinitions {
    @Steps
    twitterSteps ts;

    @Given("the user accesses the twitter landing page")
    public void open_landing_page() {
            ts.open_landing_page();
        }

    @Then("notify the user of invalid credentials")
    public void notify_user_invalid(){
    }


    @When("they login as user")
    public void login_with_user() {
        String username = System.getProperty("twitter-username");
        String password = System.getProperty("twitter-password");
        assertThat(username, not(password));
        ts.login_with_user_and_pass(username,password);
    }

    @When("they login as $username with $password")
    public void login_with_user_and_pass(String username, String password) {
        ts.login_with_user_and_pass(username, password);
    }

    @Then("there will be a tweet box")
    public void send_tweet() {
        ts.send_tweet();
    }

    @Then("write a message $message")
    public void write_a_tweet(String message) {
        ts.write_a_tweet(message);
    }

    @Then("send the tweet")
    public void write_a_tweet() {
        ts.write_a_tweet();
    }
}
