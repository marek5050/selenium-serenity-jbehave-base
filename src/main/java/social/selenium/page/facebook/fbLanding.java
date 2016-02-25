package social.selenium.page.facebook;

import net.serenitybdd.core.pages.WebElementFacade;
import social.selenium.page.interfaces.Landing;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://facebook.com/login")
public class fbLanding extends Landing {
	public fbLanding(WebDriver driver) {
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
            element(loginButton).waitUntilVisible();
            element(username).waitUntilVisible();
            element(password).waitUntilVisible();
        }catch(Exception e){
            System.out.println("Threw an exception....");
        }
    }

    public void login(String user, String pass){
        username.clear();
        element(username).type(user);
        password.clear();
        element(password).type(pass);
        loginButton.submit();
    }

    public void dump(WebElement element){
        String contents = (String)((JavascriptExecutor)this.getDriver()).executeScript("return arguments[0].innerHTML;", element);
        System.out.println(contents);
    }

	public WebElement getLoginButton() { System.out.println("Called get LoginButton ");  return loginButton; }
	
}