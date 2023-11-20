package com.rhd.spring6.projectdependencyinjection.dependency_injection.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServicePropertyInjected implements GreetingService{

    @Override
    public String sayGreString() {
       return "You (REALLY) should NOT use property injection...";
    }
    
}
