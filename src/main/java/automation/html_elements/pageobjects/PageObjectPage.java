package automation.html_elements.pageobjects;

import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

public abstract class PageObjectPage {
    protected WebDriver driver;

    public PageObjectPage(WebDriver driver) {
        this.driver = driver;
        HtmlElementLoader.populatePageObject(this, driver);
    }
}
