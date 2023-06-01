package com.zylear.spring.cloud.register.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/server")
public class RegisterServerController {

    List list = new ArrayList();

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return new ResponseEntity<>("hello", HttpStatus.OK);
    }

//    @PostConstruct
//    private void init() throws InterruptedException {
//        for (int i = 0; i < 50; i++) {
//            list.add(new byte[1024*1024]);
//            Thread.sleep(500);
//            System.out.println("add");
//        }
//    }

}
