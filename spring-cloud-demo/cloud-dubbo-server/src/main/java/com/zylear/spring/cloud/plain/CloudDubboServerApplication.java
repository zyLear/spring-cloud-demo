package com.zylear.spring.cloud.plain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CloudDubboServerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(CloudDubboServerApplication.class, args);
//        run.getBeanFactory().getBeansOfType(Object.class)
//        new SpringApplication().setWebApplicationType(WebApplicationType.NONE);
        System.out.println(run);
    }

}
