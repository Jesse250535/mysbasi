package com.controller;

import com.model.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;

@Controller
public class RegisterController {

    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    public String showregister(){
        return "register";
    }

    @RequestMapping("/doRegister")
    public String doRegister(@RequestParam String username,@RequestParam String password){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        userService.register(user);
        return "registerSuccess";
    }





}
