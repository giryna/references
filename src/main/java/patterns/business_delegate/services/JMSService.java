package patterns.business_delegate.services;

import patterns.business_delegate.services.BusinessService;

public class JMSService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}