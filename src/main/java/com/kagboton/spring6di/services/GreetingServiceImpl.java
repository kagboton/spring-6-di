package com.kagboton.spring6di.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from greeting service";
    }
}
