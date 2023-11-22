package com.rhd.spring6.projectdependencyinjection.dependency_injection.controller.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;


@ActiveProfiles("ES")
@SpringBootTest
public class I18NControllerTestEs {

    @Autowired
    private I18NController controller;
    
    @Test
    public void sayHelloTest(){
        System.out.println(this.controller.sayHello());
    }
    
}
