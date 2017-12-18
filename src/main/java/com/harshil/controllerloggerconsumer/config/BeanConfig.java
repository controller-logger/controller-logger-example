package com.harshil.controllerloggerconsumer.config;

import io.github.harshilsharma63.logger.controller.aspect.GenericControllerAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public GenericControllerAspect genericControllerAspect() {
        return new GenericControllerAspect();
    }
}
