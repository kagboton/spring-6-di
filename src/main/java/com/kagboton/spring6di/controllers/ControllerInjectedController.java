package com.kagboton.spring6di.controllers;

import com.kagboton.spring6di.services.GreetingService;

public class ControllerInjectedController {
    private GreetingService greetingService;

    public ControllerInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
