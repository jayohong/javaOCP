package com.lab.ocp.day16.schedule;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;


public class SingleScheduleDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable<Integer> c = () -> new Random().nextInt(100);
        ScheduledExecutorService service =Executors.newSingleThreadScheduledExecutor();
        System.out.println("等5秒之後進行...");
        ScheduledFuture<Integer> future=service.schedule(c, 5, TimeUnit.SECONDS);
        System.out.println(future.get());
        service.shutdown();
        System.out.println("Service關閉");
        
    }
}
