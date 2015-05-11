package patterns.dependency_injection.injectors;

import patterns.dependency_injection.Application;
import patterns.dependency_injection.impls.EmailServiceImpl;
import patterns.dependency_injection.interfaces.Consumer;
import patterns.dependency_injection.interfaces.MessageServiceInjector;

public class EmailServiceInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return new Application(new EmailServiceImpl());
    }
}
