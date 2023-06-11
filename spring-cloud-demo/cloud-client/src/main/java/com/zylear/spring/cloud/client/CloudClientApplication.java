package com.zylear.spring.cloud.client;

import com.zylear.spring.cloud.client.strategy.StrategyHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Map;

@SpringBootApplication
@EnableEurekaClient
public class CloudClientApplication {

    public static final Logger logger = LoggerFactory.getLogger(CloudClientApplication.class);

    static {
        logger.info("start.");
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(CloudClientApplication.class, args);
        logger.info("startup success.");
        Map<String, StrategyHandler> beansOfType = applicationContext.getBeansOfType(StrategyHandler.class);
        logger.info("startup success : " + beansOfType);
    }
}
