package com.rhd.spring6.projectdependencyinjection.dependency_injection.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.rhd.spring6.projectdependencyinjection.dependency_injection.services.GreetingService;

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("greetingServiceImpl") GreetingService greetingService){
        this.greetingService = greetingService;
    }
    
    public String sayHello(){
        System.out.println("ConstructorInjectedController");
        return greetingService.sayGreString();
    }
}
