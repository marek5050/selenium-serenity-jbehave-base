package social.selenium.page.github;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
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
    WebElementFacade commit;

	@FindBy(id="login_field")
    WebElementFacade loginField;

	@FindBy(id="password")
    WebElementFacade passwordField;

    @FindBy(name="q")
    WebElementFacade q;

    @FindBy(className="unstarred")
    WebElementFacade star;


	@WhenPageOpens
    public void waitUntilMainElementsAppears() {
		System.out.println("Waiting");
        try {
            commit.waitUntilVisible();
            loginField.waitUntilVisible();
            passwordField.waitUntilVisible();
        }catch(Exception e){
            System.out.println("Threw an exception....");
        }
    }

    public void clickOnTheStar(){
        if(star.isCurrentlyVisible()){
                star.submit();
        }
    }

    public void login(String user, String pass){
        typeInto(loginField,user);
        typeInto(passwordField,pass);
        clickOn(commit);
    }

    public void search(String keyword){
        try{

            q.waitUntilVisible()
             .typeAndEnter(keyword);

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
            WebElement m;
            while(ite.hasNext()){
                 m = ite.next();
                String item = m.getText();
                if(item.contains(keyword)){
                    m.findElement(By.tagName("a")).click();
                }
            }
        }catch(Exception e){
            System.out.println("It failed but so what.."+e.getMessage());
        }
    }

    public void dump(WebElement element){
        String contents = (String)((JavascriptExecutor)this.getDriver()).executeScript("return arguments[0].innerHTML;", element);
        System.out.println(contents);
    }
}