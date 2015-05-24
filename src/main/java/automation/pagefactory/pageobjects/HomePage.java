package automation.pagefactory.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class HomePage extends PageObjectPage {

    @FindBy(xpath = ".//*[@id='lst-ib']")
    private WebElement inputFied;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public SearchResultsPage searchFor(String searchTerm){
        inputFied.sendKeys(searchTerm);
        inputFied.sendKeys(Keys.ENTER);

        return new SearchResultsPage(driver);
    }

    public WebElement getInputFiedWebElement(){
        return inputFied;
    }
}
