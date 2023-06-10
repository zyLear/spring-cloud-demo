package com.zylear.spring.cloud.caller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = {"com.zylear.spring.cloud.caller.feign"})
public class CloudCallerApplication {

    public static final Logger logger = LoggerFactory.getLogger(CloudCallerApplication.class);

    static {
        logger.info("start.");
        logger.info("sdfsd ");
    }

    public static void main(String[] args) {
        SpringApplication.run(CloudCallerApplication.class, args);
        logger.info("startup success.");
    }

}
