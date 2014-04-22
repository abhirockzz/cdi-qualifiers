
package com.abhirockzz.wordpress.blog.cdi.qualifiers;

import javax.inject.Inject;


public class BasicCustomerPortal {

    @Inject @ServiceType(ServiceType.Type.BASIC)
    Service service;
    
    public void performService(){
        service.serve();
    }
}
