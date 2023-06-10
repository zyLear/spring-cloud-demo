package com.zylear.spring.cloud.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CloudWebfluxProviderApplication {

    public static final Logger logger = LoggerFactory.getLogger(CloudWebfluxProviderApplication.class);

    static {
        logger.info("start.");
    }

    public static void main(String[] args) {
        SpringApplication.run(CloudWebfluxProviderApplication.class, args);
        logger.info("startup success.");
    }
}
