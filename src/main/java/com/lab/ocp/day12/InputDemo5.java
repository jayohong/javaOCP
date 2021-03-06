package com.lab.ocp.day12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputDemo5 {

    public static void main(String[] args) {
        try {
            input();
        } catch (InputMismatchException e) {
            System.out.println(e);
        }
    }

    public static void input() {
        int[] y = {2, 5, 0};//分母
        System.out.print("請輸入分子:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();//取得使用者所輸入分子
        System.out.print("請選擇分母的陣列維度(0:2,1:5,2:0)");
        int idx = sc.nextInt();
        if (idx >= 0 && idx < y.length) {
            if (y[idx] != 0) {
                int result = x / y[idx];
                System.out.printf("%d / %d =%d\n", x, y[idx], result);
            }
        } else {
            System.out.println("維度範圍錯誤");
        }
        System.out.println("Finish");
    }
}
