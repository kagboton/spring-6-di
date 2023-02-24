package com.kagboton.spring6di.controllers;

import com.kagboton.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ControllerInjectedControllerTest {

    @Autowired
    ControllerInjectedController controllerInjectedController;

    @Test
    void sayHello() {
        System.out.println(controllerInjectedController.sayHello());
    }
}