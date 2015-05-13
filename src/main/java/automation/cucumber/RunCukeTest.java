package automation.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
        format={"pretty", "html:target/cucumber"},
        features={"src/main/java/automation/cucumber"}
)

public class RunCukeTest extends AbstractTestNGCucumberTests {
    // For running via TestNG
}
