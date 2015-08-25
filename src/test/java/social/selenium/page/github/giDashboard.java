package social.selenium.page.github;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

@DefaultUrl("http://github.com/#/dashboard")
public class giDashboard extends PageObject {

    public giDashboard(WebDriver driver) {
        super(driver);
    }
}
