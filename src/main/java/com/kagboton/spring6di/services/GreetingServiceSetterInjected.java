package com.kagboton.spring6di.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjected implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Setting a greeting";
    }
}
