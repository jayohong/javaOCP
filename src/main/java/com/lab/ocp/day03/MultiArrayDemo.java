package com.lab.ocp.day03;

public class MultiArrayDemo {
    public static void main(String[] args) {
        int[][]nums=new int[2][3];
        nums[0][0]=100;
        nums[0][1]=90;
        nums[0][2]=80;
        nums[1][0]=70;
        nums[1][1]=60;
        nums[1][2]=50;
        System.out.println(nums.length);
        System.out.println(nums);//[[I@2a139a55  [[代表二維 I代表整數
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
            for(int k=0;k<nums[i].length;k++){
                System.out.print(nums[i][k]+"\t");
            }
            System.out.println("");
        }
        
    }
}
