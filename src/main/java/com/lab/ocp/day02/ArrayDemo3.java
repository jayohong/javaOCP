package com.lab.ocp.day02;

import java.util.Arrays;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] radius = {10, 20, 30}; // 半徑
        // 計算圓面積 for-loop
        for(int i=0;i<radius.length;i++) {
            double area = Math.pow(radius[i], 2) * Math.PI;
            System.out.printf("%.2f ", area);
        }
        System.out.println();
        // 計算圓面積 for-in(each)
        for(int r:radius) {
            double area = Math.pow(r, 2) * Math.PI;
            System.out.printf("%.2f ", area);
        }
        
        System.out.println();
        // Java 8 stream()
        Arrays.stream(radius).forEach(r -> {
            double area = Math.pow(r,2) * Math.PI;
            System.out.printf("%.2f",area);
        });
//        Arrays.stream(radius).forEach(r -> {
//            double area = Math.pow(r, 2) * Math.PI;
//            System.out.printf("%.2f ", area);
//        });
        System.out.println();
        // Java 8 stream()
        Arrays.stream(radius).forEach(r -> System.out.printf("%.2f ", Math.pow(r, 2) * Math.PI));
    }
}