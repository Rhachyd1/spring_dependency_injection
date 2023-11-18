package com.rhd.spring6.projectdependencyinjection.dependency_injection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.rhd.spring6.projectdependencyinjection.dependency_injection.services.GreetingService;

@Controller
public class PropertyInjectedController {

    /**DO NOT DO THIS! EVER! */
    @Autowired
    public GreetingService greetingService;

    public String sayHello(){
        System.out.println("PropertiInjectedController");
        return greetingService.sayGreString();
    }
    
}
