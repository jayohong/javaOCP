package com.lab.ocp.day03;


public class StringDemo3 {
    public static void main(String[] args) {
       String s="Java";
       s=add(s);
        System.out.println(s);
    }
    public static String add(String s) {
        //s=s+"8";
        s=s.concat("8");
        return s;
    }
    //String 不可變 建立快  越修改會浪費資源
    //StringBuffer(多執行序) 可變 建立稍慢 不浪費資源
    //StringBuilder(單工)(java5.0以後才有) 可變 建立稍慢 不浪費資源
}
