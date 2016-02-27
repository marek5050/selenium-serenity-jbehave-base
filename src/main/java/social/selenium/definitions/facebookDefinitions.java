package social.selenium.definitions;

import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import social.selenium.steps.facebookSteps;

/**
 * Created by marek5050 on 2/25/16.
 */
public class facebookDefinitions {
    @ManagedPages
    Pages pages;

    @Steps
    facebookSteps fs;

    @Given("the user accesses the facebook landing page")
    public void open_landing_page(){
        fs.open_landing_page();
    }

    @When("they login as $user with $password")
    public void login_with_user_and_pass(String user,String password){
        fs.login_with_user_and_pass(user,password);
    }

    @Then("login should succeed")
    public void clear_up_stuff(){
    }
}
