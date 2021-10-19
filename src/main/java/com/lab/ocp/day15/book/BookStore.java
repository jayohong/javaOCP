package com.lab.ocp.day15.book;

public class BookStore {
    public static int amount = 100;
    //private String name="巨匠";<--因為
    public void borrow() { // 借書
    //public static void borrow() { // 借書<--這比較不好
        //System.out.println("我在"+ name + "借書");<--因為
        String tname = Thread.currentThread().getName();
        for(int i=0;i<Integer.MAX_VALUE;i++);
        synchronized(BookStore.class){
            if(amount<=0) return;
            System.out.printf("%s 借了第 %d 本書\n", tname, amount);
            amount--;
        }

    }
}
