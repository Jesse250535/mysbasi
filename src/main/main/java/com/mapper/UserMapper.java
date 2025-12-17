package com.mapper;

import com.model.User;
import org.apache.ibatis.annotations.Insert;

import java.util.List;


public interface UserMapper {
//     @Insert("insert into user values(#{username},#{password})")
     void insertUser(User user);
     User findUser(User user);

     List<User> findAllUser();


}
