package com.kagboton.spring6di.services.assignment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service
public class FauxServiceDev implements FauxService {
    @Override
    public String getDataSourceString() {
        return "Dev Faux Service data";
    }
}
