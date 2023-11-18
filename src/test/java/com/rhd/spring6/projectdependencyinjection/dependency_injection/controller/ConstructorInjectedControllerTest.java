package com.rhd.spring6.projectdependencyinjection.dependency_injection.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.rhd.spring6.projectdependencyinjection.dependency_injection.services.GreetingServiceImpl;

@SpringBootTest
public class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;
    
    @BeforeEach
    public void setUp(){
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void sayHelloTest(){
        System.out.println(constructorInjectedController.sayHello());
    }

    
}
