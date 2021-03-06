package com.lab.ocp.day09;

import java.util.Objects;

public class Product implements Comparable<Product>{

    @Override
    public int compareTo(Product o) {
        return (int)(price -o.price);//To change body of generated methods, choose Tools | Templates.
    }
    
    private String name;
    private Integer amount;
    private Double price;

    public Product() {
    }

    public Product(String name, Integer amount, Double price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.amount);
        hash = 37 * hash + Objects.hashCode(this.price);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", amount=" + amount + ", price=" + price + '}';
    }
    
}
