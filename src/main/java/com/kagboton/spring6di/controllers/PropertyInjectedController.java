package com.kagboton.spring6di.controllers;

import com.kagboton.spring6di.services.GreetingService;

public class PropertyInjectedController {
    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
