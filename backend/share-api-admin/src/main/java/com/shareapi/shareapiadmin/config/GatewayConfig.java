package com.shareapi.shareapiadmin.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "shareapi.gateway")
@Data
public class GatewayConfig {

    private String host;

}
