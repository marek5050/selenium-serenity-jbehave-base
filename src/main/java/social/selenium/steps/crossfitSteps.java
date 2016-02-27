package social.selenium.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import social.selenium.page.crossfit.csDashboard;
import social.selenium.page.crossfit.csLanding;
import social.selenium.page.facebook.fbDashboard;
import social.selenium.page.facebook.fbLanding;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class crossfitSteps extends ScenarioSteps {
	csLanding landingPage;

	public crossfitSteps(Pages pages) {
		super(pages);
	}


	@Step
	public void open_landing_page(){
		landingPage.open();
	}
	@Step
	public void navigate_to_athletes(){
		landingPage.navigate("athletes");
	}

	@Step
	public int getAthleteCount(){
		return landingPage.getAthletes().size();
	}
}
