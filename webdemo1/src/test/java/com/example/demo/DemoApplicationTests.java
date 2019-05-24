package com.example.demo;

import com.example.demo.entity.Cart;
import com.example.demo.entity.User;
import com.example.demo.mapper.CartMapper;
import com.example.demo.service.CartService;
import com.example.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    UserService userService;
    @Autowired
    CartService cartService;


    @Test
    public void contextLoads() {
        List<User> all = userService.findAll();

        for (User user:all) {
            System.out.println(user.toString());
        }
        System.out.println(all);
    }
    @Test
    public void contextLoads1() {

        User user=new User();
        user.setUserName("admin");
        List<Cart> all = cartService.findCartsByUserName(user);

        for (Cart cart:all) {
            System.out.println(cart.toString());
        }
        System.out.println(all);
    }

}
