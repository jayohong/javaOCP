package com.lab.ocp.day09;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hs =new HashSet();
        hs.add("國文");hs.add("數學");hs.add("英文");
        System.out.println(hs);
        
        hs =new LinkedHashSet();
        hs.add("國文");hs.add("數學");hs.add("英文");
        System.out.println(hs);
        
        //兩者結果順序不同
    }
}
