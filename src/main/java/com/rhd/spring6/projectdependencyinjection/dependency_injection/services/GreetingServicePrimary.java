package com.rhd.spring6.projectdependencyinjection.dependency_injection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServicePrimary implements GreetingService{
    
    
    @Override
    public String sayGreString() {
       return "Hello from primary bean";
    }

    
}
