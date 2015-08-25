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
	
	@Step @Given("the user accesses the twitter landing page")
	public void open_landing_page(){
		landingPage.open();
	}

	@Step @When("they login as $username with $password")
	public void login_with_user_and_pass(String username,String password){
		landingPage.login(username, password);
	}

	@Step @Then("login should succeed")
	public void clear_up_stuff(){
			driver.manage().deleteAllCookies();
	}
}
