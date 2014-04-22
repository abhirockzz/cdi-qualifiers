package com.abhirockzz.wordpress.blog.cdi.qualifiers;

@ServiceType(ServiceType.Type.PREMIUM)
public class PremiumService implements Service{

    @Override
    public void serve() {
        System.out.println("****** Premium Services rendered *************");
    }
    
}
