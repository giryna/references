package automation.pagefactory;

import automation.pagefactory.pageobjects.HomePage;
import automation.pagefactory.pageobjects.SearchResultsPage;
import junit.framework.Assert;
import org.testng.annotations.Test;

public class VerifyGooglePages extends TestRunner{

    @Test
    public void test(){
        driver.get("https://google.com");
        HomePage homePage = new HomePage(driver);

        final SearchResultsPage searchResultsPage = homePage.searchFor("happy");
        homePage = searchResultsPage.clickGoogleLogo();

        Assert.assertTrue("Input field not displayed",
                homePage.getInputFiedWebElement().isDisplayed());
    }
}
