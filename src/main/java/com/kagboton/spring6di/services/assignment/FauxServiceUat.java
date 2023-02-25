package com.kagboton.spring6di.services.assignment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service
public class FauxServiceUat implements FauxService {
    @Override
    public String getDataSourceString() {
        return "Uat Faux Service data";
    }
}
