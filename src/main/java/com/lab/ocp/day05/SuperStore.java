package com.lab.ocp.day05;

import java.util.Arrays;

public class SuperStore {
    public static void main(String[] args) {
        //單品
        Hamburger h1=new Hamburger("大麥克",70);
        Hamburger h2=new Hamburger("麥香魚",50);
        SideDish s1=new SideDish("薯條",30);
        SideDish s2 = new SideDish("沙拉",40);
        Drink d1=new Drink("可樂",25);
        Drink d2=new Drink("咖啡",25);
        Drink d3=new Drink("紅茶",25);
        
        //套餐
        FastFood f= new FastFood("一號餐");
        f.setHamburger(h2);
        f.setSideDish(s2);
        f.setDrink(d3);
        
        System.out.println(f);
        System.out.println("$" +f.getPrice());
        
        FastFood f2=new FastFood("二號餐",h1,s1,d1);
        System.out.println(f2);
        System.out.println("$" +f2.getPrice());
        
        //組合套餐
        FastFood[] ffs={f,f2,f,f,f2};
        //請問總價=?
        int sum =Arrays.stream(ffs)
                .mapToInt(h -> h.getPrice())
                .sum();
        System.out.println("sum: "+sum);
        //請問飲料(Drink)的價格占總價的幾趴(%)
        int sum_drink=Arrays.stream(ffs)
                .mapToInt(h -> h.getDrink().getPrice())
                .sum();
        System.out.println("sum_drink: "+sum_drink);
        System.out.printf("sum_drink/sum: %.2f %%\n",(double)sum_drink/sum*100);
        
    }
}
