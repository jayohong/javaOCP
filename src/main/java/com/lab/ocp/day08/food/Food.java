package com.lab.ocp.day08.food;

public interface Food {
    //品名 getter/setter
    String getName();
    abstract void setName(String name);
    //價格 getter/setter
    Integer getPrice();
    abstract void setPrice(Integer price);     
}
