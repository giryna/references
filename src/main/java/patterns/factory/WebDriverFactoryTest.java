package patterns.factory;

import org.openqa.selenium.WebDriver;

/**
 * Created by toleksyn on 9/7/2016.
 */
public class WebDriverFactoryTest {
    public static void main(String[] args) {
        final WebDriverFactory driverFactory = new WebDriverFactory();

        final WebDriver firefoxDriver = driverFactory
                .getWebDriver(Browsers.FIREFOX);
        final WebDriver chromeDriver = driverFactory.getWebDriver(Browsers.CHROME);
    }
}
