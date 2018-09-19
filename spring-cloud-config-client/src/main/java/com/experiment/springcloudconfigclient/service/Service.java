package com.experiment.springcloudconfigclient.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@org.springframework.stereotype.Service
@RefreshScope
public class Service {

    @Value("${property1-key}")
    private String configServerKey;

    public String getFromConfigServer() {
        return configServerKey;
    }

}
