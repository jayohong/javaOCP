
package com.lab.ocp.day04;

import java.util.Arrays;


public class ForLoopDemo3 {
    public static void main(String[] args) {
        String[] names={"Johe","Mary","Tom","Helen","Yuki"};
        //1.長度<=4  2.包含"o" 3.總長度    3!組合(6種)
        //Java 8
        Arrays.stream(names).forEach(System.out::print);
        
        System.out.println();
        //Java 7 for-each
        for(String name:names){
            System.out.print(name);
        }
    }
}
