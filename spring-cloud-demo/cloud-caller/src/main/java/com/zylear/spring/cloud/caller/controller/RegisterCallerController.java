package com.zylear.spring.cloud.caller.controller;

import com.zylear.spring.cloud.caller.feign.SimpleFeign;
import com.zylear.spring.cloud.caller.feign.WebfluxFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/caller")
public class RegisterCallerController {

    @Autowired
    private SimpleFeign simpleFeign;

    @Autowired
    private WebfluxFeign webfluxFeign;

    @GetMapping("/call")
    public String hello() {
        return simpleFeign.hello();
    }

    @GetMapping("/call-webflux")
    public String webflux() {
        return webfluxFeign.hello();
    }

}
