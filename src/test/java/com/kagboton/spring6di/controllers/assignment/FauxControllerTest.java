package com.kagboton.spring6di.controllers.assignment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FauxControllerTest {

    @Autowired
    FauxController fauxController;

    @Test
    void getDataSourceTest() {
        System.out.println(fauxController.getDataSource());
    }
}