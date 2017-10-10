package automation.html_elements.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.TextInput;

public class HomePage extends PageObjectPage {

    @Name("Search Input Form")
    @FindBy(xpath = ".//*[@id='lst-ib']")
    private TextInput inputField;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public SearchResultsPage searchFor(String searchTerm) {
        inputField.sendKeys(searchTerm);
        inputField.sendKeys(Keys.ENTER);

        return new SearchResultsPage(driver);
    }

    public TextInput getInputFieldWebElement() {
        return inputField;
    }
}
