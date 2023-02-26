package com.kagboton.spring6di.services.env;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class EnvServiceProd implements EnvService {
    @Override
    public String getEnvironment() {
        return "prod";
    }
}
