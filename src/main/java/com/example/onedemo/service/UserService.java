package com.example.onedemo.service;

import com.example.onedemo.entity.User;
import com.example.onedemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User Sel(int id) {
        return userMapper.Sel(id);
    }
}
