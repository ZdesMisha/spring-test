package com.dataart.web.service;

import com.dataart.web.dao.UserDao;
import com.dataart.web.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by misha on 23.09.16.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void register(User user) {
        userDao.create(user);
    }

    @Override
    public User findUser(String name) {
        return userDao.find(name);
    }
}
