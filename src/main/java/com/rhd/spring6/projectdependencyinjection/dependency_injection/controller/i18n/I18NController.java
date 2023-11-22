package com.rhd.spring6.projectdependencyinjection.dependency_injection.controller.i18n;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.rhd.spring6.projectdependencyinjection.dependency_injection.services.GreetingService;



@Controller
public class I18NController {
    

    private final GreetingService greetingService;

    public I18NController(@Qualifier("i18NService") GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return this.greetingService.sayGreString();
    }
}
