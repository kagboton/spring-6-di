package com.kagboton.spring6di.controllers;

import com.kagboton.spring6di.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ControllerInjectedController {
    private final GreetingService greetingService;

    public ControllerInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
