package com.kagboton.spring6di.services.env;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service
public class EnvServiceQa implements EnvService {
    @Override
    public String getEnvironment() {
        return "qa";
    }
}
