package com.lab.ocp.day15.book;

public class BookCilent {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        Thread t1 = new Thread(new Borrow(bookStore), "小明");
        Thread t2 = new Thread(new Borrow(bookStore), "小華");
        t1.start();
        t2.start();
    }
}