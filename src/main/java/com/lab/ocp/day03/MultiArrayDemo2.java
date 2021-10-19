package com.lab.ocp.day03;

public class MultiArrayDemo2 {
    public static void main(String[] args) {
        int[][]nums=new int[2][5];
        System.out.println(nums[1][3]);
        //對稱型陣列轉為非對稱型陣列
        nums[0]=new int[3];//指向新的陣列 舊的會變成垃圾被回收        
        nums[1]=new int[1];
        nums[1][0]=10;
        System.out.println(nums[1][3]);//舊的陣列不見 所以超出最大維度 故錯誤
        
    }
}
