package patterns.dependency_injection.impls;

import patterns.dependency_injection.interfaces.MessageService;

public class SMSServiceImpl implements MessageService {
    @Override
    public void sendMessage(String msg, String rec) {
        //logic to send SMS
        System.out.println("SMS sent to " + rec + " with Message=" + msg);
    }
}
