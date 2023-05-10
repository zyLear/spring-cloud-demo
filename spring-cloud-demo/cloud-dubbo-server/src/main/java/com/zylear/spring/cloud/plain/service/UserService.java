package com.zylear.spring.cloud.plain.service;

import com.zylear.spring.cloud.plain.dao.UserDao;
import com.zylear.spring.cloud.plain.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired(required = false)
    private UserDao userDao;

    public User findById(Long id) {
        return userDao.findById(id).orElse(null);
    }

    public void save(User user) {
        userDao.save(user);
    }
}
