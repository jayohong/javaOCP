package com.lab.ocp.day16.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool();
        //ExecutorService service = Executors.newFixedThreadPool(3);
        //ExecutorService service = Executors.newSingleThreadExecutor();
        service.submit(new Task());
        service.submit(new LongTask());
        service.submit(new LongTask());
        Thread.sleep(100);
        service.submit(new Task());
        service.submit(new Task());
        service.submit(new LongTask());
        System.out.printf("執行續數量: %d\n", Thread.activeCount());
        service.shutdown();
        while (!service.awaitTermination(1, TimeUnit.SECONDS)) {
            System.out.println("pool 持續有執行續運行中 pool尚未關閉");
        }
        //監聽Pool狀態
        System.out.println("pool 關閉");
    }
}
