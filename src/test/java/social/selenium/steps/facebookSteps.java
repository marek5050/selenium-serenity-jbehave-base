package social.selenium.steps;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;
import social.selenium.page.twitter.twDashboard;
import social.selenium.page.twitter.twLanding;

public class facebookSteps extends ScenarioSteps {

	@Managed(driver = "firefox")
	WebDriver driver;
	private final Pages pages;

	public facebookSteps(Pages pages) {
		this.pages = pages;
	}

	twLanding landingPage;
	twDashboard dashboardPage;
	
	@Step @Given("the user accesses the facebook landing page")
	public void open_landing_page(){
		landingPage.open();
	}

	@Step @When("they login as $user with $password")
	public void login_with_user_and_pass(String user,String password){
		landingPage.login(user, password);
	}

	@Step @Then("login should succeed")
	public void clear_up_stuff(){
//			driver.manage().deleteAllCookies();
	}
}
