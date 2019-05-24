package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/exit")
    public String userExit(){
        return "index";
    }




    @RequestMapping("/login")
    public String userLogin(@ModelAttribute() User user, HttpSession session){
        User user1 = userService.findUser(user);
        if ( user1 !=null) {

           return "index" ;
        }else{
            return "login";
        }
    }



    @RequestMapping(value = "/reg",method = RequestMethod.POST)
    public String userReg(@ModelAttribute("user") User user, HttpSession session){
        int suc = userService.reg(user);

        System.out.println(user.getCellphone());
        if ( suc > 0) {
            return "login" ;
        }else{
            return "reg";
        }
    }



}
