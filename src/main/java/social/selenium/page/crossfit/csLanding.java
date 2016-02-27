package social.selenium.page.crossfit;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

@DefaultUrl("http://crossfit.social")
public class csLanding extends PageObject {
	public csLanding(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText="ATHLETES")
    WebElementFacade athletes;

	@FindBy(linkText="SOCIAL MEDIA")
    WebElementFacade social;

	@FindBy(linkText="REGIONS")
    WebElementFacade regions;

    @FindBy(css=".item")
    List<WebElementFacade> items;

	@WhenPageOpens
    public void waitUntilMainElementsAppears() {
		System.out.println("Waiting");
        try {
            regions.waitUntilVisible();
        }catch(Exception e){
            System.out.println("Threw an exception....");
        }
    }

    public void navigate(String where){
        try{
            ((WebElementFacade) getClass().getDeclaredField(where).get(this)).click();
        }catch(Exception e){
            System.out.println("The navigate reflection didn't work :) ");
        }
    }

    public List<WebElementFacade> getAthletes(){
        return items;
    }
}