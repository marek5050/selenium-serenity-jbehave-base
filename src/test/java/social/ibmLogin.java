package social;

import net.serenitybdd.jbehave.SerenityStory;
import org.junit.After;
import org.junit.AfterClass;

/**
 * Created by marek5050 on 8/26/15.
 */
public class ibmLogin extends SerenityStory {
    @AfterClass
    public static void closeBrowser() throws Exception {
        System.out.println("After");
    }
    @After
    public static void closeSomething() throws Exception {
        System.out.println("After");
    }
}
