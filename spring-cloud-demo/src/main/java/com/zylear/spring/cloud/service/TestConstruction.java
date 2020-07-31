package com.zylear.spring.cloud.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class TestConstruction {

    @Value("${test.springboot.properties}")
    private String testValue;

    @PostConstruct
    private void test() {
        System.out.println("construction : " + testValue);
    }

}
