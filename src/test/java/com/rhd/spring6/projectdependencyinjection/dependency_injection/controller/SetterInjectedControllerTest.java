package com.rhd.spring6.projectdependencyinjection.dependency_injection.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.rhd.spring6.projectdependencyinjection.dependency_injection.services.GreetingServiceImpl;

@SpringBootTest
public class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;
    
    @BeforeEach
    public void setUp(){
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void sayHelloTest(){
        System.out.println(setterInjectedController.sayHello());
    }

    
}
