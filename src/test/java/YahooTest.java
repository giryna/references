import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
//import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/automation/cucumber_tests/features/yahoo-search.feature", /*tags = {"@search"},*/ format = {"html:target/cucumber-report/yahoo"})
public class YahooTest /*extends AbstractTestNGCucumberTests */{

}
