package automation.cucumber_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    private static DriverFactory instance = new DriverFactory();

    // thread local driver object for webdriver
    private final ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>() {
        @Override
        protected WebDriver initialValue() {
            return new FirefoxDriver();
        }
    };

    private DriverFactory() {
        // disabled
    }

    public static DriverFactory getInstance() {
        return instance;
    }

    // call this method to get the driver object and launch the browser
    public WebDriver getDriver() {
        return driver.get();
    }

    // Quits the driver and closes the browser
    public void removeDriver() {
        driver.get().quit();
        driver.remove();
    }
}