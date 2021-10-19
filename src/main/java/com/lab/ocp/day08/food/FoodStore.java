package com.lab.ocp.day08.food;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class FoodStore {
    //銷售資料如下
    public static void main(String[] args) {
        Food f1=new BigMac("大麥克",70,10);//大麥克 1個70元 賣了12個
        Food f2=new BigMac("麥香魚",50,15);//麥香魚 1個50元 賣了15個
        Food[] foods={f1,f2};
        Arrays.stream(foods)
                .forEach(f -> System.out.printf("品名: %s 價格: %d\n",f.getName(),f.getPrice()));
        /*
        試問:
        大麥克 1個70元 賣了12個
        麥香魚 1個50元 賣了15個
        最後的結帳費用是?
        */
        int sum = Arrays.stream(foods)
                .filter(f -> f instanceof FastFood)
                .map(f -> (FastFood)f)
                .mapToInt(ff -> ff.getCount()*ff.getPrice())
                .sum();
        System.out.println(sum);
        
    }
}