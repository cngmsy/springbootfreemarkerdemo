package com.example.demo;

import com.example.demo.entity.User;
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
    @Test
    public void contextLoads() {
        List<User> all = userService.findAll();

        for (User user:all) {
            System.out.println(user.toString());
        }
        System.out.println(all);
    }

}
