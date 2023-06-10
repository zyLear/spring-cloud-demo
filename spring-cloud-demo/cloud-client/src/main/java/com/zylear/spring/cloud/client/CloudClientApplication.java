package com.zylear.spring.cloud.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudClientApplication{

    public static final Logger logger = LoggerFactory.getLogger(CloudClientApplication.class);

    static {
        logger.info("start.");
    }

    public static void main(String[] args) {
        SpringApplication.run(CloudClientApplication.class, args);
        logger.info("startup success.");
    }
}
