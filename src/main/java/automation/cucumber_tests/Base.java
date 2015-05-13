package automation.cucumber_tests;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Base {
    private WebDriver driver;
    //    public static WebDriver driver;
    private int driverTimeout = 60;

    @Before
    public void setUp() {
        driver = DriverFactory.getInstance().getDriver();
//        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(driverTimeout, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(driverTimeout, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(final Scenario scenario) {

        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }

        DriverFactory.getInstance().removeDriver();
//        driver.quit();
    }
}
