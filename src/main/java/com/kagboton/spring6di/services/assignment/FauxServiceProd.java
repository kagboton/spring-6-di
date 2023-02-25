package com.kagboton.spring6di.services.assignment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class FauxServiceProd implements FauxService {
    @Override
    public String getDataSourceString() {
        return "Prod Faux Service data";
    }
}
