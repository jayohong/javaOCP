package com.lab.ocp.day14.thread;

public class RunnerTest2 {
    public static void main(String[] args) {
        Runner r1 = new Runner("烏龜");
        Runner r2 = new Runner("兔子");
        r1.start(); // 下達 start() 方法後會進入"排程"並執行 run() 方法
        r2.start();
    }
}