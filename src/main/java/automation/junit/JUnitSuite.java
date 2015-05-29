package automation.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        JUnit1Test.class,
        JUnit2Test.class
        })

public class JUnitSuite {
    //Do Nothing.
}