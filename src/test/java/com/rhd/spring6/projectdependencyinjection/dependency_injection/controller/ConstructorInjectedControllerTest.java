package com.rhd.spring6.projectdependencyinjection.dependency_injection.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ConstructorInjectedControllerTest {

    @Autowired
    ConstructorInjectedController constructorInjectedController;
    
  

    @Test
    public void sayHelloTest(){
        System.out.println(constructorInjectedController.sayHello());
    }

    
}
