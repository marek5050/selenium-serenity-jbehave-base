package social.selenium.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import social.selenium.page.google.goDashboard;
import social.selenium.page.google.goLanding;

public class googleSteps extends ScenarioSteps {

	goLanding landingPage;
	goDashboard dashboardPage;

	public googleSteps(Pages pages) {super(pages);}

	@Step @Given("the user accesses the google landing page")
	public void open_landing_page(){
		landingPage.open();
	}

	@Step @When("when they type in $keyword")
	public void search_for_keyword(String keyword){
		landingPage.search(keyword);
	}

	@Step @Then("we should see $keyword")
	public void find_in_results(String keyword){
		landingPage.findUrl(keyword);
	}

	@Step @Then("click on it")
	public void click_on_crossfit_social(){
//		driver.manage().deleteAllCookies();
	}
}
