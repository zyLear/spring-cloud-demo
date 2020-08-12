package com.zylear.spring.cloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.logging.LoggingSystem;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CloudApplication extends SpringBootServletInitializer {

    private static final Logger logger = LoggerFactory.getLogger(CloudApplication.class);

    static {
        logger.info("CloudApplication static test");
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CloudApplication.class, args);
        logger.info("endend");
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CloudApplication.class);
    }
}
