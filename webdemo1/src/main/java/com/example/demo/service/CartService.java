package com.example.demo.service;

import com.example.demo.entity.Cart;
import com.example.demo.entity.User;

import java.util.List;

public interface CartService {


    List<Cart> findCartsByUserName(User user);
}
