package com.lab.ocp.day08.drink;


public class Coffee implements Drink{
    private String name;
    private Integer price;

    public Coffee() {
    }

    public Coffee(String name, Integer price) {
        this.name = name;
        this.price = price;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
     }

    @Override
    public Integer getPrice() {
        return price;
    }

    @Override
    public void setPrice(Integer price) {
        this.price=price;
     }
    
}
