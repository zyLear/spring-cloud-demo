package com.zylear.spring.cloud.client.controller;

import com.zylear.spring.cloud.client.strategy.IntegerStrategyContext;
import com.zylear.spring.cloud.client.strategy.StringStrategyContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.zylear.spring.cloud.client.strategy.AbstractStrategyContext;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/client")
@Slf4j
public class RegisterClientController {

    private AtomicInteger count = new AtomicInteger(1);

    @Value("${spring.application.name}")
    private String applicationName;
    @Value("${server.port}")
    private String port;
    @Autowired
    private StringStrategyContext stringStrategyContext;
    @Autowired
    private IntegerStrategyContext integerStrategyContext;


    @GetMapping("/hello")
    public String hello() {
        log.info("called!!!!!!!!! count:{}", count.getAndIncrement());
        return applicationName + ":" + port;
    }

    @GetMapping("/handle-string")
    public String handleString(@RequestParam("param") String param) {
        stringStrategyContext.handle(param);
        return "ok";
    }

    @GetMapping("/handle-integer")
    public String handleInteger(@RequestParam("param") Integer param) {
        integerStrategyContext.handle(param);
        return "ok";
    }

}
