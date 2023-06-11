package com.zylear.spring.cloud.client.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/webflux")
@Slf4j
public class WebfluxController {

    private AtomicInteger count = new AtomicInteger(1);

    @GetMapping("/hello")
    public Mono<String> hello() {
        log.info("called!!!!!!!!! count:{}", count.getAndIncrement());
        return Mono.just("webflux hello " + count.getAndIncrement());
    }

}
