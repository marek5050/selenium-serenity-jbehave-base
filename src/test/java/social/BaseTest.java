package social;

import net.serenitybdd.jbehave.SerenityStepFactory;
import net.serenitybdd.jbehave.SerenityStories;
import org.jbehave.core.annotations.UsingSteps;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.steps.InjectableStepsFactory;

public class BaseTest extends SerenityStories {
    @Override
    public InjectableStepsFactory stepsFactory() {
        return SerenityStepFactory.withStepsFromPackage("social.selenium.steps", configuration()).andClassLoader(getClassLoader());
    }
    public BaseTest() {
//        runSerenity().inASingleSession();
    }
}