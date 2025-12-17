package com.service;

import com.model.User;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

public interface UserService {

    void insertUser(User user);

    User findUser(User user);
    List<User> findAllUser();
}
