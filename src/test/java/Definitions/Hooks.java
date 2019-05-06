package Definitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver;
    public Scenario scenario;
    @Before
    /**
     * Delete all cookies at the start of each scenario to avoid
     * shared state between tests
     */
    public void openBrowser(Scenario scenario){
        this.scenario = scenario;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //nodeURL = "http://localhost:4444/wd/hub";
        //DesiredCapabilities capability = DesiredCapabilities.chrome();
        //capability.setBrowserName("chrome");
        //capability.setPlatform(Platform.WIN10);
        //driver = new RemoteWebDriver(new URL(nodeURL), capability);
        //driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities capability = DesiredCapabilities.chrome() );
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    /**
     * Embed a screenshot in test report if test is marked as failed
     */
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()) {
            try {
                scenario.write("Esta en la pagina " + driver.getTitle());
                byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (WebDriverException somePlatformsDontSupportScreenshots) {
                System.err.println(somePlatformsDontSupportScreenshots.getMessage());
            }
        }
        //driver.quit();
    }
}
