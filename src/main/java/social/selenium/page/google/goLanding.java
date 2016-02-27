package social.selenium.page.google;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.ListIterator;

@DefaultUrl("http://google.com")
public class goLanding extends PageObject {
	public goLanding(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="[name='q']")
    WebElementFacade q;

	@FindBy(css="div.clearfix.field > input[name='btnK']")
    WebElementFacade submit;

    @FindBy(css=".rc")
    List<WebElementFacade> searchResults;


	@WhenPageOpens
    public void waitUntilMainElementsAppears() {
		System.out.println("Waiting");
        try {
            q.waitUntilVisible();
            submit.waitUntilVisible();
        }catch(Exception e){
            System.out.println("Threw an exception....");
        }
    }
    public void search(String keyword){
        q.typeAndEnter(keyword);
    }

    public void findUrl(String url){
            ListIterator<WebElementFacade> ite = searchResults.listIterator();
            while(ite.hasNext()){
                WebElement m = ite.next();
                String item = m.getText();
                if(item.contains(url)){
                    m.findElement(By.tagName("a")).click();
                    break;
                }
            }
    }
    public void dump(WebElement element){
        String contents = (String)((JavascriptExecutor)this.getDriver()).executeScript("return arguments[0].innerHTML;", element);
        System.out.println(contents);
    }
}