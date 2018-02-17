package com.harshil.controllerloggerconsumer.config;

import io.github.logger.controller.aspect.GenericControllerAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.HashSet;

@Configuration
public class BeanConfig {
    @Bean
    public GenericControllerAspect genericControllerAspect() {
        GenericControllerAspect aspect = new GenericControllerAspect();

        aspect.setEnableDataScrubbing(true);
        aspect.setDefaultScrubbedValue("*******");
        aspect.setParamBlacklistRegex("account.*");
        aspect.setCustomParamBlacklist(new HashSet<>(Arrays.asList("securityProtocol")));
        return aspect;
    }
}
