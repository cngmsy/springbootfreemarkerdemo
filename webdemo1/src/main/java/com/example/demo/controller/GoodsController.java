package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/good")
public class GoodsController {

    @RequestMapping("/det")
    public String getDet(){
        return "detail";
    }
}
