package social.selenium.definitions;

import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import social.selenium.steps.googleSteps;

/**
 * Created by marek5050 on 2/25/16.
 */
public class googleDefinitions {
    @Steps
    googleSteps gs;

    @Given("the user accesses the google landing page")
    public void open_landing_page(){
        gs.open_landing_page();
    }

    @When("when they type in $keyword")
    public void search_for_keyword(String keyword){
        gs.search_for_keyword(keyword);
    }

    @Then("we should see $keyword")
    public void find_in_results(String keyword){
        gs.find_in_results(keyword);
    }

    @StepGroup
    @Given("A user goes to google and searches for $keyword")
    public void go_to_google_and_find_me(String keyword){
        gs.open_landing_page()
          .search_for_keyword(keyword);
    }


}
