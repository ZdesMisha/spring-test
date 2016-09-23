package com.dataart.web.dao;

import com.dataart.web.entity.User;


public interface UserDao {

    void create(User user);

    User find(String name);
}
