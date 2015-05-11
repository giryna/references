package patterns.dependency_injection;

import patterns.dependency_injection.injectors.EmailServiceInjector;
import patterns.dependency_injection.injectors.SMSServiceInjector;
import patterns.dependency_injection.interfaces.Consumer;
import patterns.dependency_injection.interfaces.MessageServiceInjector;

public class MyApplicationTest {

    public static void main(String[] args) {
        String msg = "Hi Pankaj";
        String email = "pankaj@abc.com";
        String phone = "4088888888";

        MessageServiceInjector injector;
        Consumer app;

        //Send email
        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, email);

        //Send SMS
        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, phone);
    }
}
