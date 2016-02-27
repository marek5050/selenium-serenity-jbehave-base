package social.selenium.steps;

import net.thucydides.core.pages.Pages;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.annotations.Step;
import social.selenium.page.twitter.twDashboard;
import social.selenium.page.twitter.twLanding;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

public class twitterSteps extends ScenarioSteps {
    twLanding landingPage;
    twDashboard dashboardPage;

    public twitterSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void open_landing_page() {
        landingPage.open();
    }

    @Step
    public void notify_user_invalid(){
        System.out.println("=======================================================");
        System.out.println("====xxxxxxxxxx===============xxxxxxxxxxxxx=============");
        System.out.println("===============xxxxxxxxxxxxxxx=========================");
        System.out.println("===============xxxxxxxxxxxxxxx=========================");
        System.out.println("====xxxxxxxxxx===============xxxxxxxxxxxxx=============");
        System.out.println("=======================================================");
        System.out.println("=======================================================");
        System.out.println("");
        System.out.println("Please modify the POM.xml with the correct credentials.");
        System.out.println("");
        System.out.println("=======================================================");
    }


    @Step
    public void login_with_user() {
        String username = System.getProperty("twitter-username");
        String password = System.getProperty("twitter-password");
        if(!username.equals(password))
            landingPage.login(username, password);
        else{
            notify_user_invalid();
            assertThat(username,not(password));
        }
    }

    @Step
    public void login_with_user_and_pass(String username, String password) {
        landingPage.login(username, password);
    }

    @Step
    public void send_tweet() {
        dashboardPage.findTweetBox();
    }

    @Step
    public void write_a_tweet(String message) {
        dashboardPage.writeTweet(message);
    }

    @Step
    public void write_a_tweet() {
        dashboardPage.sendTweet();
    }
}