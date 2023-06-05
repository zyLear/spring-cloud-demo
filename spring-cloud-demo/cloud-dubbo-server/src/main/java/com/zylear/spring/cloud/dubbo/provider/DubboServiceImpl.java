package com.zylear.spring.cloud.dubbo.provider;


import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service(timeout = 5000)
public class DubboServiceImpl implements DubboService {


    @Override
    public String hello(String name) {
        return "hello: " + name;
    }

}
