package com.kagboton.spring6di.controllers.env;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"prod", "EN"})
@SpringBootTest
class EnvControllerProdTest {

    @Autowired
    EnvController envController;

    @Test
    void getEnvironmentTest() {
        System.out.println(envController.getEnvironment());
    }
}