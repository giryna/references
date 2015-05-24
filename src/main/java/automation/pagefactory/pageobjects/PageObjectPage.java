package automation.pagefactory.pageobjects;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public abstract class PageObjectPage {
    protected WebDriver driver;

    public PageObjectPage(WebDriver driver){
        this.driver = driver;
    }
}
