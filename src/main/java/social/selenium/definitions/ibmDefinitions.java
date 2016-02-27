package social.selenium.definitions;

import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import social.selenium.steps.ibmSteps;

/**
 * Created by marek5050 on 2/25/16.
 */
public class ibmDefinitions {
    @Steps
    ibmSteps is;

    @Given("the user accesses the ibm registration page")
    public void open_landing_page(){
        is.open_landing_page();
    }

    @When("when they click the Log in button")
    public void login_as_existing_user(){
        is.login_as_existing_user();
    }

    @Then("we should get to some page")
    public void some_page(){
        is.some_page();
    }

}
