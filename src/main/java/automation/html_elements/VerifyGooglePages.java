package automation.html_elements;

import automation.html_elements.pageobjects.HomePage;
import automation.html_elements.pageobjects.SearchResultsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyGooglePages extends TestRunner {

    @Test
    public void test() {
        driver.get("https://google.com");
        HomePage homePage = new HomePage(driver);

        final SearchResultsPage searchResultsPage = homePage.searchFor("happy");
        homePage = searchResultsPage.clickGoogleLogo();

        Assert.assertTrue(homePage.getInputFieldWebElement().isDisplayed(),
                "Input field not displayed");
    }
}
