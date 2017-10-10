package patterns.dependency_injection;

import patterns.dependency_injection.interfaces.Consumer;
import patterns.dependency_injection.interfaces.MessageService;

public class Application implements Consumer {

    private MessageService messageService;

    public Application(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void processMessages(String msg, String rec) {
        this.messageService.sendMessage(msg, rec);
    }
}
