package com.kagboton.spring6di.services.env;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service
public class EnvServiceDev implements EnvService {
    @Override
    public String getEnvironment() {
        return "dev";
    }
}
