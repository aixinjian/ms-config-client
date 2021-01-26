package com.ms.ms.config.client.vo;

import com.netflix.appinfo.MyDataCenterInfo;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.*;




/**
 * @author xinjian.ai
 * @desc volatile机制测试
 * @date 2021-01-25 15:35:26
 */
public class VolatileDemo {

    static int number = 0;

    public static void main(String[] args) throws InterruptedException {
        volatileVisiTest();
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
}
