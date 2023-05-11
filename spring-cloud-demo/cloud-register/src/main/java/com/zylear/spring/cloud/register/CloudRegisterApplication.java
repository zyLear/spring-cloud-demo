package com.zylear.spring.cloud.register;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudRegisterApplication extends SpringBootServletInitializer {

    public static final Logger logger = LoggerFactory.getLogger(CloudRegisterApplication.class);

    static {
        logger.info("start.");
    }

    public static void main(String[] args) {
        SpringApplication.run(CloudRegisterApplication.class, args);
        logger.info("startup success."); // test conflict 2
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CloudRegisterApplication.class);
    }
}
