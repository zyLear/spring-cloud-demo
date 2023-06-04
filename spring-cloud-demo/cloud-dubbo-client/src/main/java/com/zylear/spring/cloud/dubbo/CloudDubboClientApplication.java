package com.zylear.spring.cloud.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDubbo(scanBasePackages = "com.zylear.spring.cloud.dubbo")
public class CloudDubboClientApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(CloudDubboClientApplication.class, args);
//        run.getBeanFactory().getBeansOfType(Object.class)
//        new SpringApplication().setWebApplicationType(WebApplicationType.NONE);
        System.out.println(run);

    }

}
