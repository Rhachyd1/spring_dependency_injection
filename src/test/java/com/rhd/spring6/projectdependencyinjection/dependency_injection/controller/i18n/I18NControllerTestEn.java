package com.rhd.spring6.projectdependencyinjection.dependency_injection.controller.i18n;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;


@ActiveProfiles("EN")
@SpringBootTest
public class I18NControllerTestEn {

    @Autowired
    private I18NController controller;
    
    @Test
    public void sayHelloTest(){
        assertEquals("Hi! - EN", controller.sayHello());
    }
    
}
