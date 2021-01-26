package com.ms.ms.config.client.vo;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.*;




/**
 * @author xinjian.ai
 * @desc volatile机制测试
 * @date 2021-01-25 15:35:26
 */
public class VolatileDemo {

    volatile static int number = 0;

    public static void main(String[] args) throws InterruptedException {
        //volatileVisiTest();
        atomicTest();
    }

    /**
     * volatile可见性测试
     */
    public static void volatileVisiTest() throws InterruptedException {
        System.out.println("可见性测试");
        new Thread(() -> {
            System.out.println(currentThread().getName() + " 线程开始");
            try {
                TimeUnit.SECONDS.sleep(3);
                number = 10;
                System.out.println("Thread A update number value : " + number);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }, "ThreadA").start();

        System.out.println("main thread get number value：" + number);
        while (number == 0) {

        }

        System.out.println(Thread.currentThread().getName() + "\t main获取 number值: " + number);

    }

    /**
     * volatile 原子性测试
     */
    public static void atomicTest() {
        System.out.println(Thread.currentThread().getName() + " start****");
        for (int i = 1; i <= 20; i++) {
            new Thread(() -> {
                for (int j = 0; j < 10000; j++) {
                    //number++;
                    numberIncrease();
                    System.out.println(Thread.currentThread().getName()+" updated number value: " + number);

                }
            }, "Thread" + String.valueOf(i)).start();
        }

        while (Thread.activeCount() > 2) {
            Thread.yield();
        }
        System.out.println(Thread.currentThread().getName()+"\t number值: "+number);

    }

    static void numberIncrease() {
        number ++;
    }


}
