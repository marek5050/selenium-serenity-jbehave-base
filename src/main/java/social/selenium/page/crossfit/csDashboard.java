package social.selenium.page.crossfit;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("http://crossfit.social/")
public class csDashboard extends PageObject {

    public csDashboard(WebDriver driver) {
        super(driver);
    }
}
