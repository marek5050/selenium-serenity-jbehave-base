package social.selenium.page.github;

import net.serenitybdd.core.annotations.findby.By;
import social.selenium.page.interfaces.Landing;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.ListIterator;

@DefaultUrl("http://github.com/login")
public class giLanding extends Landing {
	public giLanding(WebDriver driver) {
		super(driver);
	}

	@FindBy(name="commit")
	WebElement commit;

	@FindBy(id="login_field")
    WebElement loginField;

	@FindBy(id="password")
    WebElement password;

    @FindBy(name="q")
    WebElement q;

    @FindBy(className="unstarred")
    WebElement star;


	@WhenPageOpens
    public void waitUntilMainElementsAppears() {
		System.out.println("Waiting");
        try {
            element(commit).waitUntilVisible();
            element(loginField).waitUntilVisible();
            element(password).waitUntilVisible();
        }catch(Exception e){
            System.out.println("Threw an exception....");
        }
    }

    public void clickOnTheStar(){
        element(getDriver().findElement(By.className("unstarred"))).waitUntilVisible();
        element(getDriver().findElement(By.className("unstarred"))).submit();
        element(getDriver().findElement(By.className("starred"))).waitUntilVisible();
    }

    public void login(String user, String pass){
        loginField.clear();
        element(loginField).type(user);
        password.clear();
        element(password).type(pass);
        commit.submit();
    }

    public void search(String keyword){
        try{
            element(q).waitUntilVisible();
            element(q).typeAndEnter(keyword);
        }catch(Exception e){
            System.out.println("It failed but so what.."+e.getMessage());
        }finally{
            System.out.println("Finally done");
        }
    }

    public void findUrl(String keyword){
        try{
            List<WebElement> l  = getDriver().findElements(By.cssSelector(".repo-list-name"));
            ListIterator<WebElement> ite = l.listIterator();
            while(ite.hasNext()){
                WebElement m = ite.next();
                String item = m.getText();
                if(item.contains(keyword)){
                    m.findElement(By.tagName("a")).click();
                }
            }
        }catch(Exception e){
            System.out.println("It failed but so what.."+e.getMessage());
        }finally{
        }
    }

    public void dump(WebElement element){
        String contents = (String)((JavascriptExecutor)this.getDriver()).executeScript("return arguments[0].innerHTML;", element);
        System.out.println(contents);
    }
}