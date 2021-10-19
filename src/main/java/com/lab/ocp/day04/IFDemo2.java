package com.lab.ocp.day04;

public class IFDemo2 {
    public static void main(String[] args) {
        int x=70;//main.x
        if(add(x)){
            System.out.println(x);//main.x
        }
    }
    public static boolean add(int x) {//這邊x是區域變數(add.x)
        if(x>=50){
            x=x+1;
            return true; 
        }
        return false;
    }
}
