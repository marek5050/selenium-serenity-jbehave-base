package social.selenium.page.github;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("http://github.com/#/dashboard")
public class giDashboard extends PageObject {
    public giDashboard(WebDriver driver) {
        super(driver);
    }
}
