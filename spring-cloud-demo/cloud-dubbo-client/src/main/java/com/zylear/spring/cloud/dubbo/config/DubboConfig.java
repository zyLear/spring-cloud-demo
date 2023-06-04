//package com.zylear.spring.cloud.dubbo.config;
//
//import com.alibaba.dubbo.config.ApplicationConfig;
//import com.alibaba.dubbo.config.ConsumerConfig;
//import com.alibaba.dubbo.config.ProtocolConfig;
//import com.alibaba.dubbo.config.RegistryConfig;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class DubboConfig {
//    /**
//     * 提供方应用信息，用于计算依赖关系
//     */
//    @Bean
//    public ApplicationConfig applicationConfig() {
//        ApplicationConfig applicationConfig = new ApplicationConfig();
//        applicationConfig.setName("dubbo-consumer");
//        return applicationConfig;
//    }
//
//    /**
//     * 设置调用服务超时时间
//     * 关闭所有服务的启动时检查
//     */
//    @Bean
//    public ConsumerConfig consumerConfig() {
//        ConsumerConfig consumerConfig = new ConsumerConfig();
//        consumerConfig.setTimeout(3000);
//        consumerConfig.setCheck(false);
//        return consumerConfig;
//    }
//
//
//}
