package com.lab.ocp.day16.schedule;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleDemo {
    public static void main(String[] args) {
        Runnable r = () -> {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            Date begin = new Date();
            System.out.printf("%s ", sdf.format(begin));
            int lotto = new Random().nextInt(9) + 1; // 1~9
            int delayTime = new Random().nextInt(6_500);
            try {
                Thread.sleep(delayTime);
            } catch (Exception e) {
            }
            Date end = new Date();
            System.out.printf("開獎: %d delatTime:%d (%s)\n", lotto, delayTime, sdf.format(end));
        };
        
        ScheduledExecutorService service = Executors.newScheduledThreadPool(3);
        // 3 秒後執行第一次開獎, 爾後每 5 秒執行開獎乙次
        //service.scheduleWithFixedDelay(r, 3, 5, TimeUnit.SECONDS);
        service.scheduleAtFixedRate(r, 3, 5, TimeUnit.SECONDS);
        
    }
}

