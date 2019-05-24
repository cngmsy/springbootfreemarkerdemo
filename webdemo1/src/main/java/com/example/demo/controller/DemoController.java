package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//总入口
@Controller
@RequestMapping("/index")
public class DemoController {

    //直接进入商品页面
    @RequestMapping("/home")
    public String toIndex(){
        return "index";
    }


    //直接进入登陆页面
    @RequestMapping("/login")
    public String toLogin(){
        return "login";
    }


    //直接进入注册页面
    @RequestMapping("/reg")
    public String toReg(){
        System.out.println("2222222222222");
        return "reg";
    }



    @RequestMapping("/adminlogin")
    public String toAdminLogin(){
        return "/admin/adminlogin";
    }







}
