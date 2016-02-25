package social.selenium.page.google;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import social.selenium.page.interfaces.Landing;

import java.util.List;
import java.util.ListIterator;

@DefaultUrl("http://google.com")
public class goLanding extends Landing {
	public goLanding(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="[name='q']")
    WebElementFacade q;

	@FindBy(css="div.clearfix.field > input[name='btnK']")
    WebElementFacade submit;

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
        try{
            WebElement w= getDriver().findElement(By.tagName("cite"));
            element(w).waitUntilVisible();

            WebElement e = getDriver().findElement(By.id("resultStats"));
            element(e).waitUntilVisible();

        }catch(Exception e){
            System.out.println("It failed but so what.."+e.getMessage());
        }finally{
            List<WebElement> l  = getDriver().findElements(By.cssSelector(".rc"));
            ListIterator<WebElement> ite = l.listIterator();
            while(ite.hasNext()){
                WebElement m = ite.next();
                String item = m.getText();
                if(item.contains(url)){
                    m.findElement(By.tagName("a")).click();
                }
            }
        }

    }
    public void dump(WebElement element){
        String contents = (String)((JavascriptExecutor)this.getDriver()).executeScript("return arguments[0].innerHTML;", element);
        System.out.println(contents);
    }
}