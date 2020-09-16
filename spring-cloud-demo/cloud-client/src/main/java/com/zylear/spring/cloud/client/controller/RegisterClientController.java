package com.zylear.spring.cloud.client.controller;

import lombok.extern.slf4j.Slf4j;
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

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        log.info("called!!!!!!!!! count:{}", count.getAndIncrement());
        return new ResponseEntity<>("hello", HttpStatus.OK);
    }

}
