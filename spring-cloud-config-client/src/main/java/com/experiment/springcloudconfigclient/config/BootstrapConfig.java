package com.experiment.springcloudconfigclient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.retry.interceptor.RetryOperationsInterceptor;

public class BootstrapConfig {

    @Bean(name = "configServerRetryInterceptor")
    public RetryOperationsInterceptor configServerRetryInterceptor() {
        return new RetryOperationsInterceptor();
    }
}
