package social.selenium.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import social.selenium.page.github.giDashboard;
import social.selenium.page.github.giLanding;

public class githubSteps extends ScenarioSteps {

	giLanding landingPage;
	giDashboard dashboardPage;

	public githubSteps(Pages pages) {
		super(pages);
	}


	@Step
	public void open_landing_page(){
		landingPage.open();
	}

	@Step
	public void login_as_user(){
		String username = System.getProperty("github-username");
		String password = System.getProperty("github-password");
		landingPage.login(username, password);
	}

	@Step
	public void git_repo_page(){}

	@Step
	public void click_on_the_star(){
        landingPage.clickOnTheStar();
	}

	@Step
	public void search_for_keyword(String keyword){
		landingPage.search(keyword);
    }

	@Step
	public void find_in_results(String keyword){
		landingPage.findUrl(keyword);
	}
}
