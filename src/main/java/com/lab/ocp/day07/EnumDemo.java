package com.lab.ocp.day07;

enum Sex{
    man,female;    
    private Sex(){      
    System.out.println("呼叫Sex建構子");
    }
}

public class EnumDemo {
    public static void main(String[] args) {
        System.out.println("B");
        checkSex(Sex.man);
        System.out.println("C");
    }
    public static void checkSex(Sex sex) {
        System.out.println("A");
        switch(sex){
            case man:
                System.out.println("男生");
                break;
            case female:
                System.out.println("女生");
                break;
        }
    }
}
