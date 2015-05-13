package automation.cucumber_tests.steps;

import automation.cucumber_tests.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
        import cucumber.api.java.en.When;
        import org.openqa.selenium.By;
        import org.openqa.selenium.Keys;
        import org.testng.Assert;

public class SharedSteps {

    //Given I visit "site url" url
    @Given("^I visit \"([^\"]*)\" url$")
    public void I_visit(String arg1) {
        DriverFactory.getInstance().getDriver().get(arg1);
//        Base.driver.get(arg1);

    }

    //When I click the button
    @When("^I click the \"([^\"]*)\" button$")
    public void i_click_button(String locator) {
        DriverFactory.getInstance().getDriver().findElement(By.xpath(locator)).click();
//        Base.driver.findElement(By.xpath(locator)).click();

    }

    @Then("^I should see \"([^\"]*)\" element$")
    public void i_should_see(String locator){
        Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(By.xpath(locator)).isDisplayed());
//        Assert.assertTrue(Base.driver.findElement(By.xpath(locator)).isDisplayed());

    }

    @Then("^I enter \"([^\"]*)\" text into \"([^\"]*)\" element$")
    public void i_enter_text(String text, String locator){
        DriverFactory.getInstance().getDriver().findElement(By.xpath(locator)).sendKeys(text);
        DriverFactory.getInstance().getDriver().findElement(By.xpath(locator)).sendKeys(Keys.ENTER);

//        Base.driver.findElement(By.xpath(locator)).sendKeys(text + Keys.ENTER);
    }

    //Given I wait x seconds
    @Given("^I wait ([0-9]*) seconds$")
    public void I_wait_seconds(String arg1) {
        try {
            Thread.sleep(Integer.parseInt(arg1) * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
