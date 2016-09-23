package com.dataart.web.service;

import com.dataart.web.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created by misha on 23.09.16.
 */
public interface UserService {
     void register(User user);
     User findUser(String name);
}
