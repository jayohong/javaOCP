package com.lab.ocp.day07;


public class Animal {
    public void move(){  //如果用private會有問題 因為兒子看不到老爸 
                         //override會找不到
                          //至少要用default 或 public以上層級
        System.out.println("動");
    }
}
