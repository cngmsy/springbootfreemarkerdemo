package com.example.demo.service.impl;

import com.example.demo.entity.Cart;
import com.example.demo.entity.CartExample;
import com.example.demo.entity.User;
import com.example.demo.mapper.CartMapper;
import com.example.demo.service.CartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CartServiceImpl implements CartService {

    @Resource
    CartMapper cartMapper;

    @Override
    public List<Cart> findCartsByUserName(User user) {
        CartExample cartExample=new CartExample();

        CartExample.Criteria criteria = cartExample.createCriteria();


        CartExample.Criteria criteria1 = criteria.andUserNameEqualTo(user.getUserName());

        List<Cart> carts = cartMapper.selectByExample(cartExample);
        return carts;
    }

    @Override
    public int insertCart(Cart cart) {
        int insert = cartMapper.insert(cart);
        return insert;
    }
}
