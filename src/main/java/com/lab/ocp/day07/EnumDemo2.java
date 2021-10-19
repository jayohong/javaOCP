
package com.lab.ocp.day07;

enum TWCurrency{
    一元(1),伍元(5),拾元(10),一百元(100),
    兩百元(200),伍佰元(500),一千元(1000),兩千元(2000);
    int value;
    public int getValue() {
        return value;
    }
    private TWCurrency(int value){//私有建構子
        this.value=value;
    }
}
public class EnumDemo2 {
    public static void main(String[] args) {
        TWCurrency twc1=TWCurrency.兩百元;
        TWCurrency twc2=TWCurrency.兩千元;
        System.out.println(twc1.getValue() + twc2.getValue());
    }    
}
