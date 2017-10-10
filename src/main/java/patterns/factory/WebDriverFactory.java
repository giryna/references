package patterns.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    public WebDriver getWebDriver(final Browsers browsers) {

        WebDriver webDriver;

        switch (browsers) {
            case FIREFOX:
                webDriver = new FirefoxDriver();
                break;
            case CHROME:
                System.setProperty("path", "");
                webDriver = new ChromeDriver();
                break;
            default:
                webDriver = new FirefoxDriver();
                break;
        }

        return webDriver;
    }
}
