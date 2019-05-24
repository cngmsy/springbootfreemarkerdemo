package com.example.demo.service.impl;

import com.example.demo.entity.Goods;
import com.example.demo.entity.GoodsExample;
import com.example.demo.mapper.GoodsMapper;
import com.example.demo.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class GoodsServiceImpl implements GoodsService {
    @Resource
    GoodsMapper goodsMapper;
    @Override
    public  List<Goods> findGoodsById(int gid) {
        GoodsExample goodsExample=new GoodsExample();

        GoodsExample.Criteria criteria = goodsExample.createCriteria();

        GoodsExample.Criteria criteria1 = criteria.andIdEqualTo(gid);

        List<Goods> goods = goodsMapper.selectByExample(goodsExample);

        return goods;
    }

    @Override
    public int insertGood(Goods goods) {

        int insert = goodsMapper.insert(goods);
        return insert;
    }
}
