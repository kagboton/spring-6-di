package com.kagboton.spring6di.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("FR")
@SpringBootTest
class Myi18NControllerTestFR {

    @Autowired
    Myi18NController controller;

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}