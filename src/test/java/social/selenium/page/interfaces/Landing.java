package social.selenium.page.interfaces;

import net.serenitybdd.core.pages.PageObject;

import org.openqa.selenium.WebDriver;

public abstract class Landing extends PageObject {
    public Landing(WebDriver driver) {
        super(driver);
    }
}