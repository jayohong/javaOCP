package com.lab.ocp.day03;

public class StringDemo2 {
    public static void main(String[] args) {
        String s="Java";
        System.out.println("在main方法的S= "+s);
        add(s);
        System.out.println("在main方法的S= "+s);
    }
    public static void add(String s) {
        System.out.println("在ADD方法的S= "+s);
        s=s+"8";
        System.out.println("在ADD方法的S= "+s);
    }
}
