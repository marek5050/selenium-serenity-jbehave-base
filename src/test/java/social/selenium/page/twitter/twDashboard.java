package social.selenium.page.twitter;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import social.selenium.page.interfaces.Dashboard;

import java.util.ArrayList;
import java.util.List;

@DefaultUrl("https://twitter.com/")
public class twDashboard extends Dashboard {

    public twDashboard(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="tweet-box-home-timeline")
    WebElement tweetBoxHomeTimeline;

    @FindBy(className="js-tweet-btn")
    WebElement Tweet;

    @WhenPageOpens
    public void waitUntilMainElementsAppears() {
        System.out.println("Waiting");
        try {
            element(tweetBoxHomeTimeline).waitUntilVisible();
            element(Tweet).waitUntilVisible();
        }catch(Exception e){
            System.out.println("Threw an exception....");
        }
    }

    public void findTweetBox(){
        element(tweetBoxHomeTimeline).waitUntilVisible();
    }

    public void sendTweet(){
        element(Tweet).waitUntilVisible();
        Tweet.click();
    }
    public void writeTweet(String message){
        element(tweetBoxHomeTimeline).click();
        element(tweetBoxHomeTimeline).type(message);
    }

}
