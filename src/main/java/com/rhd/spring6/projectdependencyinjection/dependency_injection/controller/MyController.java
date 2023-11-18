package com.rhd.spring6.projectdependencyinjection.dependency_injection.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    

    public String sayHello(){
        System.out.println("Im in controller");
        return "Hello everyone";
    }
}
