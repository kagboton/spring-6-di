package com.kagboton.spring6di.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
class Myi18NControllerTestEN {

    @Autowired
    Myi18NController controller;

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}