package patterns.dependency_injection.interfaces;

import patterns.dependency_injection.interfaces.Consumer;

public interface MessageServiceInjector {
    public Consumer getConsumer();
}
