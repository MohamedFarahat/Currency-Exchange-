package com.microservices.limitsservice;

import com.microservices.limitsservice.bean.limitsConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public limitsConfiguration retrievelimitsConfiguration() {
        return new limitsConfiguration(configuration.getMaximum(),configuration.getMinimum());
    }
}
