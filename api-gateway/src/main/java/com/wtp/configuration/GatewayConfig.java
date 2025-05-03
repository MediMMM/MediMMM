package com.wtp.configuration;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class GatewayConfig {

    @Bean
    public GatewayFilter loggingFilter() {
        return new GatewayFilter();
    }
}