package com.lab.ocp.day03;

public class EqualsDemo {

    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = 'A';
        System.out.println(c1 == c2);//true
 
        String s1 = new String("Java");
        String s2 = new String("Java");
        String s3 = new String("java");
        System.out.println(s1 == s2);//false
        System.out.println("s1(hashcode):" + s1.hashCode());
        System.out.println("s2(hashcode):" + s2.hashCode());
        System.out.println("s3(hashcode):" + s3.hashCode());
        System.out.println("a".hashCode());
        System.out.println("abb".hashCode());
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equalsIgnoreCase(s3));//true
        String s4 = "Java";
        String s5 = "Java";
        System.out.println(s4 == s5);//true
        System.out.println(s4.equals(s5));//true
//        char[]c={'J','a','v','a'};
        char[] c = {'J', 'a', 'v', 'a',};
        String s6 = new String(c);
        System.out.println(s6);//Java
        System.out.println(s1.equals(s6));//true
        System.out.println(s4.equals(s6));//true
        

        Object O1 = 'a';
        Object O2 = 'a';
        System.out.println(O1.equals(O2));
        System.out.println(O1==O2);
        System.out.println(O1.hashCode());
        System.out.println(O2.hashCode());
    }
}

