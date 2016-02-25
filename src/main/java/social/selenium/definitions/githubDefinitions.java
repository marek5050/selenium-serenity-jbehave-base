package social.selenium.definitions;

import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import social.selenium.steps.facebookSteps;
import social.selenium.steps.githubSteps;

import static org.junit.Assert.assertFalse;

/**
 * Created by marek5050 on 2/25/16.
 */
public class githubDefinitions {
    @ManagedPages
    Pages pages;

    @Steps
    githubSteps gs;

    @Given("the user accesses the github landing page")
    public void open_landing_page(){
        gs.open_landing_page();
    }

    @When("when they login as user")
    public void login_as_user(){
        String username = System.getProperty("github-username"),
               password = System.getProperty("github-password");
        assertFalse(username.equals(password));
        gs.login_as_user();
    }

    @Then("we should be on the main gitrepo page")
    public void git_repo_page(){}

    @Then("click the star")
    public void click_on_the_star(){
        gs.click_on_the_star();
    }

    @When("search for $keyword")
    public void search_for_keyword(String keyword){
        gs.search_for_keyword(keyword);
    }

    @Then("we should see $keyword")
    public void find_in_results(String keyword){
        gs.find_in_results(keyword);
    }

}
