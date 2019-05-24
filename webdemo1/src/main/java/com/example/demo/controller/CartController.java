package com.example.demo.controller;

import com.example.demo.entity.Cart;
import com.example.demo.entity.User;
import com.example.demo.mapper.CartMapper;
import com.example.demo.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/cart")
public class CartController {

    @Autowired
    CartService cartService;

    @RequestMapping("/list")
    public String getList(HttpSession session, Model model){
        User user = (User) session.getAttribute("user");

        if (user == null) {
            model.addAttribute("info","请先登陆");
            return "login";
        }else if (user.getUserName() != null) {
            List<Cart> carts = cartService.findCartsByUserName(user);

            model.addAttribute("list",carts);
            session.setAttribute("success","当前购物车商品有"+carts.size());
            return "cart";
        }else{
            model.addAttribute("info","请先登陆");
            return "login";
        }


    }
}
