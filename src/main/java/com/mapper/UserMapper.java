package com.mapper;

import com.model.User;
import org.apache.ibatis.annotations.Insert;

public interface UserMapper {
     @Insert("insert into user values(#{username},#{password})")
     void insertUser(User user);
     User findUser(User user);


}
