package com.kagboton.spring6di.services.env;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service
public class EnvServiceUat implements EnvService {
    @Override
    public String getEnvironment() {
        return "uat";
    }
}
