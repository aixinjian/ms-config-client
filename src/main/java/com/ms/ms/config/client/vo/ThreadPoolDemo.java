package com.ms.ms.config.client.vo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author xinjian.ai
 * @desc 线程池demo
 * @date 2021-03-11 17:17:16
 */
public class ThreadPoolDemo {
    private static volatile int number = 0;

    public static void main(String[] args) {
        signalTreadRunTest();
    }

    public static void signalTreadRunTest() {
        long startTime = System.currentTimeMillis();
        System.out.println("start time :"+startTime);
        for (int i = 0; i < 20; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName());
                for (int j = 0; j < 1000; j++) {
                    number ++;
               }
            },"Thread"+i).start();
        }
        System.out.println(number);
        long endTime = System.currentTimeMillis();
        System.out.println("processing time :"+(endTime-startTime));
    }

}
