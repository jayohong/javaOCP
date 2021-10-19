package com.lab.ocp.day08.drink;

//飲料規格
public interface Drink {
    //品名 getter/setter
    String getName();
    abstract void setName(String name);
    //價格 getter/setter
    Integer getPrice();
    abstract void setPrice(Integer price);
    
}
