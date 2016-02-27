package social.selenium.page.twitter;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://twitter.com/")
public class twDashboard extends PageObject {

    public twDashboard(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="tweet-box-home-timeline")
    WebElementFacade tweetBoxHomeTimeline;

    @FindBy(className="js-tweet-btn")
    WebElementFacade Tweet;

    @WhenPageOpens
    public void waitUntilMainElementsAppears() {
        System.out.println("Waiting");
        try {
            tweetBoxHomeTimeline.waitUntilVisible();
            Tweet.waitUntilVisible();
        }catch(Exception e){
            System.out.println("Threw an exception....");
        }
    }

    public void findTweetBox(){
        tweetBoxHomeTimeline.waitUntilVisible();
    }

    public void sendTweet(){
        Tweet.waitUntilVisible().click();
    }
    public void writeTweet(String message){
        tweetBoxHomeTimeline.click();
        typeInto(tweetBoxHomeTimeline,message);
    }

}
