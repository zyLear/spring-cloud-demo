package com.zylear.spring.cloud.client.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicInteger;

@Controller
@RequestMapping("/client")
@Slf4j
public class RegisterClientController {

    private AtomicInteger count = new AtomicInteger(1);

    @Value("${spring.application.name}")
    private String applicationName;
    @Value("${server.port}")
    private String port;

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        log.info("called!!!!!!!!! count:{}", count.getAndIncrement());
        return new ResponseEntity<>(applicationName + ":" + port, HttpStatus.OK);
    }

}
