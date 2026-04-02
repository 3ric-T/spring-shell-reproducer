package com.example.demo.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * Created by EricT on 4/2/26.
 */
@Component
public class DemoRunner implements ApplicationRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(DemoRunner.class);

    @Override
    public void run(ApplicationArguments args) throws Exception {
        LOGGER.info("This is my runner!");
    }
}
