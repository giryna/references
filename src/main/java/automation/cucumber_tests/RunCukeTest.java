package automation.cucumber_tests;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

// for JUnit use:
// @RunWith(Cucumber.class)
@CucumberOptions(
        format={"pretty", "html:target/cucumber"},
        features={"src/main/java/automation/cucumber_tests/features/"}
)

public class RunCukeTest extends AbstractTestNGCucumberTests {
    // For running via TestNG
}
