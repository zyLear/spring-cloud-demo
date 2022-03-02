package com.zylear.spring.cloud.plain.controller;

import com.zylear.spring.cloud.plain.manager.UserManager;
import com.zylear.spring.cloud.plain.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@Controller
@RequestMapping("/plain")
public class RegisterServerController {

    @Autowired
    private UserManager userManager;

    @PostConstruct
    private void init() {
        System.out.println("sout something");
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return new ResponseEntity<>("hello", HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    @ResponseBody
    public User hello(@PathVariable Long id) {

        User user = userManager.findById(id);
        return user;
    }

}
