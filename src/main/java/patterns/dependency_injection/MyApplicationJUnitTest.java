package patterns.dependency_injection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import patterns.dependency_injection.interfaces.Consumer;
import patterns.dependency_injection.interfaces.MessageServiceInjector;

public class MyApplicationJUnitTest {

    private MessageServiceInjector injector;

    @Before
    public void setUp(){
        //mock the injector
        injector = () -> new Application(
                (String msg, String rec) -> System.out.println("Mock Message Service implementation")
        );
    }

    @Test
    public void test() {
        final Consumer consumer = injector.getConsumer();
        consumer.processMessages("Hi Pankaj", "pankaj@abc.com");
    }

    @After
    public void tear(){
        injector = null;
    }
}