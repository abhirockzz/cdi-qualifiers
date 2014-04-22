package com.abhirockzz.wordpress.blog.cdi.qualifiers;

@ServiceType(ServiceType.Type.BASIC)
public class BasicService implements Service{

    @Override
    public void serve() {
        System.out.println("****** Basic Services rendered *************");
    }
    
}
