package com.kagboton.spring6di.services.assignment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service
public class FauxServiceQa implements FauxService {
    @Override
    public String getDataSourceString() {
        return "Qa Faux Service data";
    }
}
