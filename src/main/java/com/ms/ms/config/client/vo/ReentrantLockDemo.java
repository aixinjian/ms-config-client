package com.ms.ms.config.client.vo;

import org.aspectj.weaver.tools.Trace;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xinjian.ai
 * @desc ReentrantLock demo
 * @date 2021-03-08 17:28:52
 */
public class ReentrantLockDemo {
    public static void main(String[] args) {
        reentrantLockTest();
    }

    public static void reentrantLockTest() {
        ReentrantLock lock = new ReentrantLock();
        int i = 0;
        for(;i<10;i++){
            new Thread(()->{
                lock.lock();
                try{
                    for (int j = 0; j < 10; j++) {
                        System.out.println("线程执行结果：" + j);
                    }
                }finally {
                    lock.unlock();
                }
            },"ReentrantThread" +i ).start();
        }

    }
}
