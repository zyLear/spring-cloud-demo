package com.zylear.spring.cloud.dubbo.manager;

import com.zylear.spring.cloud.dubbo.model.User;
import com.zylear.spring.cloud.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class UserManager {

    @Autowired
    private UserService userService;


    @Transactional
    public User findById(Long id) {
        System.out.println("lalala");

        User user = new User();
        user.setId(id);

        userService.save(user);


        return userService.findById(id);
    }
}
