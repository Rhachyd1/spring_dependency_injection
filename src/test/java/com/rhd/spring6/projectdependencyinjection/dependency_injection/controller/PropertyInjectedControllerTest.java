package com.rhd.spring6.projectdependencyinjection.dependency_injection.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PropertyInjectedControllerTest {

    @Autowired
    PropertyInjectedController propertyInjectedController;
  
    @Test
    public void sayHelloTest(){
        assertEquals("You (REALLY) should NOT use property injection...",propertyInjectedController.sayHello());
    }

    
}
