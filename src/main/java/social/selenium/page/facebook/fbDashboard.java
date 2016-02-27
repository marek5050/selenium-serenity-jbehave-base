package social.selenium.page.facebook;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("http://facebook.com/")
public class fbDashboard extends PageObject {

    public fbDashboard(WebDriver driver) {
        super(driver);
    }
}
