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

	@Step
	public googleSteps open_landing_page(){
		landingPage.open();
		return this;
	}

	@Step
	public googleSteps search_for_keyword(String keyword){
		landingPage.search(keyword);
		return this;
	}

	@Step
	public googleSteps find_in_results(String keyword){
		landingPage.findUrl(keyword);
		return this;
	}
}
