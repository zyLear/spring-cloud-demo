package com.zylear.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CloudApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CloudApplication.class, args);

    }

}
