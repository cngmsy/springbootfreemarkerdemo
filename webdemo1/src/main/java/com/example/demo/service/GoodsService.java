package com.example.demo.service;

import com.example.demo.entity.Goods;

import java.util.List;

public interface GoodsService {

    List<Goods> findGoodsById(int id);


    int insertGood(Goods goods);
}
