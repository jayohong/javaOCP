package com.lab.ocp.day09;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args) {
        HashSet hs =new HashSet();
        hs.add("國文");hs.add(100);
        hs.add("數學");hs.add(90);
        hs.add("英文");hs.add(100);
        hs.add(null);hs.add(3.14);
        System.out.println(hs);
        //印出每一筆資料 Java 7 for-loop
        for(Object obj:hs){
            System.out.println(obj);
        }
        //印出每一筆資料 Java 8 foreach
        hs.forEach(obj -> System.out.println(obj));
        hs.forEach(System.out::println);//方法參照
    }
}
