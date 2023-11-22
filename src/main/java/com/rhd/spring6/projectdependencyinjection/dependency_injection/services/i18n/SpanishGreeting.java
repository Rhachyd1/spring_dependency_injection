package com.rhd.spring6.projectdependencyinjection.dependency_injection.services.i18n;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.rhd.spring6.projectdependencyinjection.dependency_injection.services.GreetingService;

@Profile("ES")
@Service("i18NService")
public class SpanishGreeting implements GreetingService {

    @Override
    public String sayGreString() {
       return "Hola! - ES";
    }
    
}
