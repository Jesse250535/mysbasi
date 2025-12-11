package com.service.impl;
import com.model.User;
import com.service.UserService;
import com.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public void register(User user)
    {
        userMapper.register(user);
    }
}
