package com.zylear.spring.cloud.plain.config;

import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.Servlet;
import java.util.Collections;

/**
 * @author xiezongyu
 * @date 2020/9/1
 */
@Configuration
@ComponentScan("com.zylear.spring.cloud.plain.controller")
public class WebMvcConfig {

    @Bean
//            (name = DispatcherServletAutoConfiguration.DEFAULT_DISPATCHER_SERVLET_REGISTRATION_BEAN_NAME)
    public ServletRegistrationBean servletRegistrationBean(){
        AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
        webApplicationContext.register(WebMvcConfig.class);
        DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);

        //todo 待解谜题  差别不大的配置  一个不能访问  一个可以   有待验证


//        ServletRegistrationBean<Servlet> registrationBean = new ServletRegistrationBean<>(dispatcherServlet);
//        registrationBean.setUrlMappings(Collections.singletonList("/app/*"));
//        registrationBean.setName("dispatcherServlet2");

        DispatcherServletRegistrationBean registrationBean = new DispatcherServletRegistrationBean(dispatcherServlet, "/app/*");
        registrationBean.setName("dispatcherServlet2");

        registrationBean.setLoadOnStartup(1);

        return registrationBean;
    }

}
