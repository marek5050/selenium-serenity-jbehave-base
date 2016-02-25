package social.selenium.page.IBM;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import social.selenium.page.interfaces.Landing;

@DefaultUrl("https://console.ng.bluemix.net/registration/")
public class ibmLanding extends Landing {
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
            Assert.assertFalse(getDriver().getTitle().contains("Resource not found"));
    }
}