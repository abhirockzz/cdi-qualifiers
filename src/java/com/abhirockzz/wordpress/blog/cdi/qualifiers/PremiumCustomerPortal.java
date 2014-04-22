package com.abhirockzz.wordpress.blog.cdi.qualifiers;

import javax.inject.Inject;


public class PremiumCustomerPortal {
    
    @Inject @ServiceType(ServiceType.Type.PREMIUM)
    Service service;
    
    public void performService(){
        service.serve();
    }
}
