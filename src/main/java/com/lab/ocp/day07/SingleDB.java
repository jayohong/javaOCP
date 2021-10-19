package com.lab.ocp.day07;

public class SingleDB {
    //節省資源 不讓人new物件
    private String data="一百萬筆資料....";
    private static SingleDB instance =new SingleDB();//static只會有一份
    private SingleDB() {
        
    }
    public static SingleDB getInstance(){
        return instance;
    }
    public String getData() {
        return data;
    }
    
    
}
