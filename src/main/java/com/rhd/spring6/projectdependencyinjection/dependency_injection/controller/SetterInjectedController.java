package com.rhd.spring6.projectdependencyinjection.dependency_injection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.rhd.spring6.projectdependencyinjection.dependency_injection.services.GreetingService;

@Controller
public class SetterInjectedController {
    
    private GreetingService greetingService;
    
    /**DO NOT DO THIS! EVER! */
    @Autowired
    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }
    
    public String sayHello(){
        System.out.println("SetterInjectionController");
        return greetingService.sayGreString();
    }
}
