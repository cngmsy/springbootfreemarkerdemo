package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {

   User findUser(User user);


   List<User> findAll();


   int reg(User user);

}
