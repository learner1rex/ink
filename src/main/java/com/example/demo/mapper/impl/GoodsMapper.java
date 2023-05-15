package com.example.demo.mapper.impl;

import com.example.demo.Entity.Goods;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GoodsMapper extends JpaRepository<Goods,Integer> {
    @Transactional
    boolean deleteGoodsByGoodsId(Integer id);
}
