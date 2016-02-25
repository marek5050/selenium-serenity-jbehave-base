package social.selenium.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import social.selenium.page.facebook.fbDashboard;
import social.selenium.page.facebook.fbLanding;

public class facebookSteps extends ScenarioSteps {
	fbLanding landingPage;
	fbDashboard dashboardPage;

	public facebookSteps(Pages pages) {
		super(pages);
	}


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
