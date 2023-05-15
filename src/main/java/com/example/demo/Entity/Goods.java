package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Goods {
    @Id
    private Integer goodsId;
    private String goodsName;
    private Double price;
    private Integer itemInventory;

    private Integer adminId;
    private String goodsDetails;

    public Goods(Integer goodsId, String goodsName, Double price, Integer itemInventory, Integer adminId, String goodsDetails) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.price = price;
        this.itemInventory = itemInventory;
        this.adminId = adminId;
        this.goodsDetails = goodsDetails;
    }

    public Goods() {

    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getItemInventory() {
        return itemInventory;
    }

    public void setItemInventory(Integer itemInventory) {
        this.itemInventory = itemInventory;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getGoodsDetails() {
        return goodsDetails;
    }

    public void setGoodsDetails(String goodsDetails) {
        this.goodsDetails = goodsDetails;
    }
}
