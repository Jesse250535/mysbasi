package com.mapper;

import com.model.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;


public interface UserMapper {
     @Insert("insert into user values(#{username},#{password})")
     void insertUser(User user);
     @Select("select * from user where username=#{username} and password=#{password}")
     User findUser(User user);

     @Select("select * from user")
     List<User> findAllUser();

     @Delete("delete from user where username=#{username}")
     int deleteUser(String username);

     @Update("update user set password=#{password} where username=#{username}")
     int updatePassword(User user);



}
