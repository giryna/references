package patterns.business_delegate;

public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){

        switch (serviceType.toUpperCase()){
            case "EJB":
                return new EJBService();
            default:
                return new JMSService();
        }
    }
}