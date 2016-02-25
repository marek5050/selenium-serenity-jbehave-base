package social.selenium.page.IBM;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://console.ng.bluemix.net/registration/")
public class ibmDashboard extends PageObject {
    public ibmDashboard(WebDriver driver) {
        super(driver);
    }
}
