package com.kagboton.spring6di.services.i18n;

import com.kagboton.spring6di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("FR")
@Service("i18nService")
public class FrenchGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Bonjour le monde - FR";
    }

}
