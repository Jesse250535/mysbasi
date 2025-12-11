package com.service;

import com.model.User;
import org.apache.ibatis.annotations.Insert;

public interface UserService {
    @Insert("insert into user values(#{username},#{password})")
    void register(User user);
}
