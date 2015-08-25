package social.selenium.steps;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;
import social.selenium.page.google.goDashboard;
import social.selenium.page.google.goLanding;
import social.selenium.page.twitter.twDashboard;
import social.selenium.page.twitter.twLanding;

public class googleSteps extends ScenarioSteps {

	@Managed(driver = "firefox")
	WebDriver driver;
	private final Pages pages;

	public googleSteps(Pages pages) {
		this.pages = pages;
	}

	goLanding landingPage;
	goDashboard dashboardPage;
	
	@Step @Given("the user accesses the google landing page")
	public void open_landing_page(){
		landingPage.open();
	}

	@Step @When("when they type in $keyword")
	public void login_with_user_and_pass(String keyword){
		landingPage.search(keyword);
	}

	@Step @Then("we should see $keyword")
	public void find_crossfit_social(String keyword){
		System.out.println("We should see.... ") ;
		landingPage.findUrl(keyword);
	}

	@Step @Then("click on it")
	public void click_on_crossfit_social(){

		driver.manage().deleteAllCookies();
	}
}
