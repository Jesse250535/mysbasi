package com.controller;

import com.mapper.UserMapper;
import com.model.User;
import com.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    // 一个功能一个方法：
    // 跳转到注册界面=》方法：知道方法如何编写即可，方法：有参数有返回值  有参数无返回值  无参数有返回值 无参数无返回值
    @Autowired
    private UserService userService;
    @RequestMapping("/showRegister")
    public  String  showRegister(){
        return  "register";
    }

    // 实现注册功能：1.获取数据
    @RequestMapping("/register")
    public String register(String username,String password){

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
//        userMapper.insertUser(user);
        userService.register(user);
        return "registerSuccess";
    }
    // 1.登录界面

// 1. 完成注册
// 2. 登录功能

}
