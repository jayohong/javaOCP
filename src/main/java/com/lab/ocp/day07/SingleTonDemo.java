package com.lab.ocp.day07;


public class SingleTonDemo {
    public static void main(String[] args) {
        //用的是同一個物件
        SingleDB db=SingleDB.getInstance();
        System.out.println(db.getData());
        SingleDB db2=SingleDB.getInstance();
        System.out.println(db2.getData());
    }
}
