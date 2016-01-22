package social.selenium.page.facebook;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

@DefaultUrl("http://facebook.com/")
public class fbDashboard extends PageObject {

    public fbDashboard(WebDriver driver) {
        super(driver);
    }

}
