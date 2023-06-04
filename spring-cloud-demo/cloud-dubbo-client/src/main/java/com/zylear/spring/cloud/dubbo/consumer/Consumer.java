package com.zylear.spring.cloud.dubbo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zylear.spring.cloud.dubbo.provider.DubboService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Consumer {

    @Reference(url = "dubbo://localhost:20880")
    private DubboService dubboService;

    @PostConstruct
    private void init() {
        System.out.println("consumer test");
        System.out.println(dubboService.hello("something hahahahah clinet"));
    }

}
