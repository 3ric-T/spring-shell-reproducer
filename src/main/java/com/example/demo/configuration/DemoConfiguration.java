package com.example.demo.configuration;

import com.example.demo.properties.DemoProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo.properties")
public class DemoConfiguration {
    private static final Logger LOGGER = LoggerFactory.getLogger(DemoConfiguration.class);

    @Bean
    String requiresDemoAttribute(DemoProperties demoProperties) {
        if (demoProperties.getDemo() != null) {
            LOGGER.info("demo property has been set: {}", demoProperties.getDemo());
            return demoProperties.getDemo();
        } else {
            throw new IllegalArgumentException("DemoProperties not loaded!!");
        }
    }
}