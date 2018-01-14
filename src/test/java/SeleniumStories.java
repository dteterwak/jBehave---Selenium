import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Arrays;
import java.util.List;

public class SeleniumStories extends JUnitStories {


    public SeleniumStories(){
        super();
    }

    @Override public Configuration configuration(){
        return new MostUsefulConfiguration();
    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        System.setProperty("webdriver.gecko.driver","J:/Selenium/geckodriver-v0.19.1-win64/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        return new InstanceStepsFactory( configuration(),
                new BasicRadioButton(driver),
                new JQueryDownloadBar(driver),
                new AjaxForm(driver),
                new JQueryDatePicker(driver),
                new SimpleForm(driver));
    }

    @Override
    protected List<String> storyPaths() {
        return Arrays.asList("webtest.story");
    }

}
