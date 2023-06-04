package com.zylear.spring.cloud.dubbo.service;

import com.zylear.spring.cloud.dubbo.dao.UserDao;
import com.zylear.spring.cloud.dubbo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
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
