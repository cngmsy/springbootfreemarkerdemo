package com.example.demo.controller;

import com.example.demo.entity.Cart;
import com.example.demo.entity.Goods;
import com.example.demo.entity.User;
import com.example.demo.mapper.CartMapper;
import com.example.demo.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

@Controller
@RequestMapping("/cart")
public class CartController {

    @Autowired
    CartService cartService;

    @RequestMapping("/list")
    public String getList(HttpSession session, Model model){
        User user = (User) session.getAttribute("user");

        return showCartList(session, model, user);


    }

    private String showCartList(HttpSession session, Model model, User user) {
        if (user == null) {
            model.addAttribute("info","请先登陆");
            return "login";
        }else if (user.getUserName() != null) {
            List<Cart> carts = cartService.findCartsByUserName(user);

            model.addAttribute("list2",carts);


            model.addAttribute("total",getTotal(carts));
            session.setAttribute("success","当前购物车商品有"+carts.size());
            return "cart";
        }else{
            model.addAttribute("info","请先登陆");
            return "login";
        }
    }


    @RequestMapping("/add")
    public String add(HttpServletRequest request, HttpSession session, Model model){
        User user = (User) session.getAttribute("user");
        String name = request.getParameter("name");
//		name = new String(name.getBytes("ISO-8859-1"), "UTF-8");
        String type = request.getParameter("color");
        int price = Integer.parseInt(request.getParameter("price"));
        BigDecimal prices= BigDecimal.valueOf(price);
        String num = request.getParameter("num");
        String gids=request.getParameter("gid");
        Cart cart = new Cart();
        String ss=gids.replace(",","");
        cart.setGid(Integer.parseInt(ss));

        String img=request.getParameter("img");
        cart.setImg(img);
        cart.setName(name);
        cart.setType(type);
        cart.setNum(Integer.parseInt(num));
        String names=user.getUserName()==null?user.getUserName():"admin";
        cart.setUserName(names);
        cart.setPrice(prices);

        int i = cartService.insertCart(cart);



        if (i >0) {
          return   "index";
        }else {
            model.addAttribute("errorInfo","添加商品失败");
            return "detail";
        }

    }

    private float getTotal(List<Cart> carts) {
        float total=0;
        for (Cart cart:carts) {
           float price= cart.getPrice().floatValue();

            float to = cart.getNum() * price;
            total+=to;
        }
        return total;
    }
}
