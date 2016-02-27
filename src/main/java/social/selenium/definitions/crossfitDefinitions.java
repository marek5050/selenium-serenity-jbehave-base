package social.selenium.definitions;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import social.selenium.steps.crossfitSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.number.OrderingComparison.greaterThan;

/**
 * Created by marek5050 on 2/25/16.
 */
public class crossfitDefinitions {
    @Steps
    crossfitSteps cs;

    @Given("the user accesses the crossfit.social landing page")
    public void open_landing_page(){
        cs.open_landing_page();
    }

    @When("they select Athletes")
    public void navigate_to_athletes(){
        cs.navigate_to_athletes();
    }

    @Then("we should see a list of athletes")
    public void list_of_athletes(){
        assertThat(cs.getAthleteCount(),greaterThan(5));
    }
}
