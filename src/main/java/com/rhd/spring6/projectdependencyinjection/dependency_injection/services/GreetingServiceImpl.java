package com.rhd.spring6.projectdependencyinjection.dependency_injection.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreString() {
        System.out.println("Hi!");
        return "Hi, Im not the Primary!";
    }
    
}
