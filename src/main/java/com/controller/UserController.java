package com.controller;

import com.mapper.UserMapper;
import com.model.User;
import com.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    // 一个功能一个方法：
    // 跳转到注册界面=》方法：知道方法如何编写即可，方法：有参数有返回值  有参数无返回值  无参数有返回值 无参数无返回值
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public  String  showRegister(){
        return  "register";
    }
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegisterForm(){
        return "register";
    }

    // 实现注册功能：1.获取数据
    @RequestMapping(value = "/doregister",method = RequestMethod.POST)
    public String doregister(String username,String password){

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
