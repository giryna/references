package automation.pagefactory.pageobjects;

import org.openqa.selenium.WebDriver;

public abstract class PageObjectPage {
    protected WebDriver driver;

    public PageObjectPage(WebDriver driver) {
        this.driver = driver;
    }
}
