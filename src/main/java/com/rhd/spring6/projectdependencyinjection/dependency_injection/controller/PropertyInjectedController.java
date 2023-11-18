package com.rhd.spring6.projectdependencyinjection.dependency_injection.controller;

import com.rhd.spring6.projectdependencyinjection.dependency_injection.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String sayHello(){
        return "Hello";
    }
    
}
