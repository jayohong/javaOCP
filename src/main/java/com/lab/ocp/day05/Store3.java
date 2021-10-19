package com.lab.ocp.day05;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Store3 {
    public static void main(String[] args) {
        Hamburger[] hamburgers={
            new Hamburger("麥香魚",50),
            new Hamburger("麥香魚",60),
            new Hamburger("大麥克",90),
            new Hamburger("麥香魚",60),
            new Hamburger("麥香魚",90),
            new Hamburger("大麥克",60),
            new Hamburger("吉士滿意",100),
            new Hamburger("麥香雞",60),
            new Hamburger("小漢堡",30),
            new Hamburger("吉士堡",40),
        };
        //總共的價格是?寫法一
        int sum=0;        
        for(int i=0;i<hamburgers.length;i++){
            sum+=hamburgers[i].getPrice();
        }
        System.out.printf("總價:%d\n",sum);
        
        //總共的價格是?寫法二
        int sum2=0;
        for(Hamburger h:hamburgers){
            sum2 += h.getPrice();
        }
        System.out.printf("總價:%d\n",sum2);
        
        //總共的價格是?寫法三 Java8寫法
        int sum3 = Arrays.stream(hamburgers)
                .mapToInt(h -> h.getPrice())
                .sum();
        System.out.printf("總價:%d\n",sum3);
        //平均價格
        IntSummaryStatistics stat = Arrays.stream(hamburgers)
                .mapToInt(h -> h.getPrice())
                .summaryStatistics();
        System.out.printf("平均: %.1f\n",stat.getAverage());
        System.out.printf("總價: %d\n",stat.getSum());
        System.out.printf("最貴: %d\n",stat.getMax());
        System.out.printf("最便宜: %d\n",stat.getMin());
        System.out.printf("個數: %d\n",stat.getCount());
        System.out.println(stat);
    }
}
