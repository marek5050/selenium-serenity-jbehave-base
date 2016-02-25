package social.selenium.page.twitter;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import social.selenium.page.interfaces.Landing;

@DefaultUrl("http://twitter.com/login")
public class twLanding extends Landing {
	public twLanding(WebDriver driver) {
		super(driver);
	}

	@FindBy(css=".submit.btn.primary-btn")
    WebElementFacade loginButton;

	@FindBy(css="div.clearfix.field > input[name=\"session[username_or_email]\"]")
    WebElementFacade username;

	@FindBy(css="div.clearfix.field > input[name=\"session[password]\"]")
    WebElementFacade password;

	@WhenPageOpens
    public void waitUntilMainElementsAppears() {
		System.out.println("Waiting");
        try {
            loginButton.waitUntilVisible();
        }catch(Exception e){
            System.out.println("Threw an exception....");

        }
    }

    public void login(String user, String pass){
        typeInto(username,user);
        password.typeAndEnter(pass);
    }

    public void dump(WebElement element){
        String contents = (String)((JavascriptExecutor)this.getDriver()).executeScript("return arguments[0].innerHTML;", element);
        System.out.println(contents);
    }
}