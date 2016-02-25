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


	@Step
	public void open_landing_page(){
		landingPage.open();
	}

	@Step
	public void login_as_existing_user(){
		landingPage.click_login();
	}

	@Step
	public void some_page(){
		landingPage.valid_page();
	}
}
