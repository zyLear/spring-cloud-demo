//package com.zylear.spring.cloud.dubbo.config;
//
//import com.alibaba.dubbo.config.ApplicationConfig;
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
//        applicationConfig.setName("dubbo-provider");
//        return applicationConfig;
//    }
//    /**
//     *  直连
//     */
//    @Bean
//    public RegistryConfig registryConfig() {
//        RegistryConfig registryConfig = new RegistryConfig();
//        registryConfig.setAddress("N/A");
//        return registryConfig;
//    }
//    /**
//     * 用 dubbo 协议在 20880 端口暴露服务
//     */
//    @Bean
//    public ProtocolConfig protocolConfig() {
//        ProtocolConfig protocolConfig = new ProtocolConfig();
//        protocolConfig.setName("dubbo");
//        protocolConfig.setPort(20880);
//        return protocolConfig;
//    }
//
//}
