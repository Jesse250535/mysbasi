package com.controller;

import com.mapper.UserMapper;
import com.model.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import untli.MyBatisUtil;

@Controller
public class UserController {
    // 一个功能一个方法：
    // 跳转到注册界面=》方法：知道方法如何编写即可，方法：有参数有返回值  有参数无返回值  无参数有返回值 无参数无返回值
    @RequestMapping("/showRegister1")
    public  String  showRegister(){
        return  "register";
    }

    // 实现注册功能：1.获取数据
    @RequestMapping("/register1")
    public String register(String username,String password){
        SqlSession sqlSession = null;
        sqlSession = MyBatisUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        userMapper.insertUser(user);

        return "registerSuccess";
    }
    // 1.登录界面
    @RequestMapping("/showLogin1")
    public  String  showLogin(){
        return  "login";
    }
    // 2.实现登录功能
    @RequestMapping("/login1")
    public String login(String username,String password){
        SqlSession sqlSession = null;
        sqlSession = MyBatisUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        //
        User user1 = userMapper.findUser(user) ;

        return "loginSuccess";
    }
// 1. 完成注册
// 2. 登录功能

}
