package com.rhd.spring6.projectdependencyinjection.dependency_injection.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyControllerTest {
    
    @Autowired
    private MyController controller;

    @Test
    public void returnGreeting(){
        assertEquals("Hi, Im not the Primary!",controller.sayHello());
        
    }
}
