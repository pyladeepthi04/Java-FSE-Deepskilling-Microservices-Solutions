package com.cognizant.slf4j.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LoggingExample {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(LoggingExample.class);

    public void demonstrateLogging() {

        String user = "Deepthi";
        int id = 101;

        LOGGER.info("User Name: {}, User Id: {}", user, id);

        LOGGER.warn("Welcome {}!", user);

        LOGGER.error("Unable to process request for user {}", user);
    }
}