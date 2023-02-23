package com.kagboton.spring6di.controllers;

import com.kagboton.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerInjectedControllerTest {

    ControllerInjectedController controllerInjectedController;

    @BeforeEach
    void setUp() {
        controllerInjectedController = new ControllerInjectedController(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        System.out.println(controllerInjectedController.sayHello());
    }
}