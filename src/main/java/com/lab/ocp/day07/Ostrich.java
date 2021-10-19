package com.lab.ocp.day07;


public class Ostrich extends Bird{

    @Override
    public void move() { //public不可拿掉 因為權限不能比老爸小
    //public void move(int x)  也不能加引數
         System.out.println("走");
    }
    void motto() { //座右銘
        System.out.println("鴕鳥精神");
    }
}
