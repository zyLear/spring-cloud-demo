package com.zylear.spring.cloud.caller.controller;

import com.zylear.spring.cloud.caller.feign.SimpleFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/caller")
public class RegisterClientController {

    @Autowired
    private SimpleFeign simpleFeign;

    @GetMapping("/call")
    public ResponseEntity<String> hello() {
        simpleFeign.hello();
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }

}
