package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/exit")
    public String userExit(){
        return "index";
    }




    @RequestMapping("/login")
    public String userLogin(){
        if ( true) {
           return "index" ;
        }else
        return "login";
    }
}
