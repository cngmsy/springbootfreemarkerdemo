package com.example.demo.controller;

import com.example.demo.entity.Goods;
import com.example.demo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.websocket.server.PathParam;
import java.util.List;

@Controller
@RequestMapping("/good")
public class GoodsController {

    @Autowired
    GoodsService goodsService;
    @RequestMapping("/det")
    public String getDet(@PathParam("id") int id, Model model){
        List<Goods> goods = goodsService.findGoodsById(id);

        if (goods.size() != 0) {
            model.addAttribute("list",goods);
            return "detail";
        }else{
            model.addAttribute("errorinfo","商品详情待完善");
            return "index";
        }

    }
}
