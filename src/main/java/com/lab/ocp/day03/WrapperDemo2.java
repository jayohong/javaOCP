package com.lab.ocp.day03;

public class WrapperDemo2 {
    public static void main(String[] args) {
        int a=100;
        a=200;
        //Integer b=Integer.valueOf("100");//java5之前寫法
        Integer b=100;//java5(含)之後寫法,auto-unboxing 自動裝箱
        b=200;
        System.out.println(a);//int
        System.out.println(b);//Integer
        System.out.println(a+b.intValue());//java5之前寫法
        System.out.println(a+b);//java5(含)之後寫法,auto-unboxing 自動拆箱
        
    }
}
