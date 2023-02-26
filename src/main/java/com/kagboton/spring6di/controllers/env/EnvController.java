package com.kagboton.spring6di.controllers.env;

import com.kagboton.spring6di.services.env.EnvService;
import org.springframework.stereotype.Controller;

@Controller
public class EnvController {
    private final EnvService service;

    public EnvController(EnvService service) {
        this.service = service;
    }

    String getEnvironment(){
        return "This is " + service.getEnvironment() + " environment.";
    }
}
