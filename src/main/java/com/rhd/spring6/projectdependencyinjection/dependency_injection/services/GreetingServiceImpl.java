package com.rhd.spring6.projectdependencyinjection.dependency_injection.services;

public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreString() {
        System.out.println("Hi!");
        return "Hi";
    }
    
}
