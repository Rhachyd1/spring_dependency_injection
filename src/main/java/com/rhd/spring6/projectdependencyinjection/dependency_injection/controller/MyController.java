package com.rhd.spring6.projectdependencyinjection.dependency_injection.controller;

import org.springframework.stereotype.Controller;

import com.rhd.spring6.projectdependencyinjection.dependency_injection.services.GreetingService;
import com.rhd.spring6.projectdependencyinjection.dependency_injection.services.GreetingServiceImpl;

@Controller
public class MyController {
    

    private final GreetingService greetingService;

    public MyController(){
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        System.out.println("Im in controller");
        return this.greetingService.sayGreString();
    }
}
