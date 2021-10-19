package com.lab.ocp.day10;

//自動裝箱 自動拆箱
public class AutoBoxingUnboxing {
    public static void main(String[] args) {
        
    }
    public static int getInt() {
        Integer integer = new Integer("100");
        return integer;//java5之後 可以不用這樣寫integer.intValue()
                        //自動拆箱auto-unboxing
    }
    public static int getInteger() {
        int i=100;
        return i;  //Integer.valueOf(i);//自動裝箱 auto-boxing
    }
}
