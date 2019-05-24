package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;


    @Override
    public User findUser(User user) {
        User user1 = userMapper.findUser(user);
        return user1;
    }


    @Override
    public List<User> findAll() {

        List<User> all = userMapper.findAll();
        return all;
    }

    @Override
    public int reg(User user) {
        int insert = userMapper.insert(user);
        return insert;
    }
}
