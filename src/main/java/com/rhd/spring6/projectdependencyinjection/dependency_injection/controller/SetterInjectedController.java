package com.rhd.spring6.projectdependencyinjection.dependency_injection.controller;

import com.rhd.spring6.projectdependencyinjection.dependency_injection.services.GreetingService;

public class SetterInjectedController {
    
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreString();
    }
}
