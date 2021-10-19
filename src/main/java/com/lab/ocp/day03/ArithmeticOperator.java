
package com.lab.ocp.day03;

import java.math.BigDecimal;

public class ArithmeticOperator {
    public static void main(String[] args) {
        System.out.println(0.1+0.1==0.2);//true
        System.out.println(0.1+0.1+0.1==0.3);//false
        System.out.println(0.1+0.1);
        System.out.println(0.1+0.1+0.1);//因為IEEE754用指數去算浮點數所以才不等於0.3
        
        //假設要用浮點數算出真值
        BigDecimal a= new BigDecimal("0.1");
        BigDecimal b= new BigDecimal("0.1");
        BigDecimal c= new BigDecimal("0.1");
        BigDecimal d=a.add(b).add(c);
        System.out.println(d.doubleValue());
        System.out.println(d.doubleValue()==0.3);
             
    }
}
