package social.selenium.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import social.selenium.page.IBM.ibmDashboard;
import social.selenium.page.IBM.ibmLanding;

public class ibmSteps extends ScenarioSteps {

	ibmLanding landingPage;
	ibmDashboard dashboardPage;

	public ibmSteps(Pages pages) {
		super(pages);
	}


	@Step @Given("the user accesses the ibm registration page")
	public void open_landing_page(){
		landingPage.open();
	}

	@Step @When("when they click the Log in button")
	public void login_as_existing_user(){
		landingPage.click_login();
	}

	@Step @Then("we should get to some page")
	public void some_page(){
		landingPage.valid_page();
	}
}
