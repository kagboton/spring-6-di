package com.kagboton.spring6di.controllers.assignment;

import com.kagboton.spring6di.services.assignment.FauxService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class FauxController {
    private final FauxService service;

    public FauxController(FauxService service) {
        this.service = service;
    }

    String getDataSource(){
        return service.getDataSourceString();
    }
}
