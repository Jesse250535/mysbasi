package com.controller;


import com.model.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    // 一个功能一个方法：
    // 跳转到注册界面=》方法：知道方法如何编写即可，方法：有参数有返回值  有参数无返回值  无参数有返回值 无参数无返回值
    @Autowired
    private UserService userService;
    @RequestMapping( "/showRegister")
    public  String  showRegister(){
        return  "/register";
    }

    // 实现注册功能：1.获取数据
    @RequestMapping( value = "/register", method = RequestMethod.POST)
    public String doregister(@RequestParam String username,@RequestParam String password){

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        userService.insertUser(user);
        return "registerSuccess";
    }
    // 1.登录界面
    @RequestMapping( value = "/showLogin", method = RequestMethod.GET)
    public  String  showLogin(){
        return  "/login";
    }

    @RequestMapping( value = "/login", method = RequestMethod.POST)
    public String dologin(@RequestParam String username, @RequestParam String password, Model model){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        User loguser = userService.findUser(user);
        if(loguser != null){
            model.addAttribute("users", userService.findAllUser());
           return "loghome";
        }else {
            model.addAttribute("error","用户名或密码错误");
            model.addAttribute("username",username);
            return "login";
        }
    }
// 实现查询用户信息


}
