package com.lab.ocp.day16.pool;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LongTask implements Runnable{

    @Override
    public void run() {
        System.out.printf("長任務開始\n");
        int n= new Random().nextInt(9000);
        try {
            TimeUnit.SECONDS.sleep(new Random().nextInt(10));
        } catch (InterruptedException ex) {
            Logger.getLogger(LongTask.class.getName()).log(Level.SEVERE, null, ex);
        }
        n+=1000;
        System.out.printf("長任務(得到1000~9999的值):%d\n",n);
        System.out.printf("長任務結束\n");
    }
    
}
