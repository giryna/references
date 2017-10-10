package patterns.business_delegate;

import patterns.business_delegate.services.BusinessService;
import patterns.business_delegate.services.EJBService;
import patterns.business_delegate.services.JMSService;

public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType) {

        switch (serviceType.toUpperCase()) {
            case "EJB":
                return new EJBService();
            default:
                return new JMSService();
        }
    }
}