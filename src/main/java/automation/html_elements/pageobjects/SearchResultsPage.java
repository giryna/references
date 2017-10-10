package automation.html_elements.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Image;

public class SearchResultsPage extends PageObjectPage {
    @FindBy(xpath = ".//*[@id='logocont']//a")
    private Image googleLogo;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public HomePage clickGoogleLogo() {
        googleLogo.click();

        return new HomePage(driver);
    }
}
