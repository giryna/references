package patterns.dependency_injection.injectors;

import patterns.dependency_injection.Application;
import patterns.dependency_injection.impls.SMSServiceImpl;
import patterns.dependency_injection.interfaces.Consumer;
import patterns.dependency_injection.interfaces.MessageService;
import patterns.dependency_injection.interfaces.MessageServiceInjector;

public class SMSServiceInjector implements MessageServiceInjector{
    @Override
    public Consumer getConsumer() {
        return new Application(new SMSServiceImpl());
    }
}
