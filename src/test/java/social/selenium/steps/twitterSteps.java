package social.selenium.steps;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.Pages;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import social.selenium.page.twitter.twDashboard;
import social.selenium.page.twitter.twLanding;

import static org.junit.Assert.assertTrue;

public class twitterSteps extends ScenarioSteps {

    @Managed(driver = "firefox")
    WebDriver driver;
    private final Pages pages;

    public twitterSteps(Pages pages) {
        this.pages = pages;
    }

    twLanding landingPage;
    twDashboard dashboardPage;

    @Step
    @Given("the user accesses the twitter landing page")
    public void open_landing_page() {
        landingPage.open();
    }

    @Step
    @Then("notify the user of invalid credentials")
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
    @When("they login as user")
    public void login_with_user() {
        String username = System.getProperty("twitter-username");
        String password = System.getProperty("twitter-password");
        landingPage.login(username, password);
    }

    @Step
    @When("they login as $username with $password")
    public void login_with_user_and_pass(String username, String password) {
        landingPage.login(username, password);
    }

    @Step
    @Then("there will be a tweet box")
    public void send_tweet() {
        dashboardPage.findTweetBox();
    }

    @Step
    @Then("write a message $message")
    public void write_a_tweet(String message) {
        dashboardPage.writeTweet(message);
    }

    @Step
    @Then("send the tweet")
    public void write_a_tweet() {
        dashboardPage.sendTweet();
    }
}