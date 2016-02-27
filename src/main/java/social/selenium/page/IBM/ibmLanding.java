package social.selenium.page.IBM;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebDriver;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

@DefaultUrl("https://console.ng.bluemix.net/registration/")
public class ibmLanding extends PageObject {
	public ibmLanding(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText="Log in")
    WebElementFacade loginButton;

	@WhenPageOpens
    public void waitUntilMainElementsAppears() {
		System.out.println("Waiting");
        try {
            loginButton.waitUntilVisible();
        }catch(Exception e){
            System.out.println("Threw an exception....");
        }
    }

    public void click_login(){
        clickOn(loginButton);
    }
    public void valid_page (){
            assertThat(getDriver().getTitle(), not("Resource not found"));
    }
}