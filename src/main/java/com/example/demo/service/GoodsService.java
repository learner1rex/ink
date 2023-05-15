package com.example.demo.service;

import com.example.demo.Entity.Goods;
import com.example.demo.mapper.impl.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
@RestController
@RequestMapping(("/Goods"))
@CrossOrigin(allowedHeaders = {"*"})
public class GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    @GetMapping(value = "/get")
    public List<Goods> getAll(){
        return goodsMapper.findAll();
    }


    @PostMapping(value = "add")
    public boolean addGoods(@RequestBody Goods goods){
        try {
            goodsMapper.save(goods);
        }catch (Exception e){
            return false;
        }finally {
            return true;
        }
    }

    @DeleteMapping(value = "/delete/{id}")
    public boolean deleteGoods(@PathVariable("id") Integer id){
        return goodsMapper.deleteGoodsByGoodsId(id);
    }

}
