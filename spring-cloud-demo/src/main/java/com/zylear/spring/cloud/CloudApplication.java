package com.zylear.spring.cloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.logging.LoggingSystem;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.net.UnknownHostException;

@SpringBootApplication
public class CloudApplication extends SpringBootServletInitializer {

    private static final Logger logger = LoggerFactory.getLogger(CloudApplication.class);


//    @Bean
//    public String redisTemplate(Integer oneo){
//        return "x";
//    }

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
