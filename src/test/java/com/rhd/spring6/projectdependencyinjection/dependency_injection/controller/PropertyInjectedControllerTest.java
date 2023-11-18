package com.rhd.spring6.projectdependencyinjection.dependency_injection.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.rhd.spring6.projectdependencyinjection.dependency_injection.services.GreetingServiceImpl;

@SpringBootTest
public class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;
    
    @BeforeEach
    public void setUp(){
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService= new GreetingServiceImpl();
    }

    @Test
    public void sayHelloTest(){
        System.out.println(propertyInjectedController.sayHello());
    }

    
}
