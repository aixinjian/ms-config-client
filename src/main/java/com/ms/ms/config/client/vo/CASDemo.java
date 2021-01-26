package com.ms.ms.config.client.vo;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author xinjian.ai
 * @desc
 * @date 2021-01-19 19:33:13
 */
public class CASDemo {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(5);
        System.out.println(atomicInteger.compareAndSet(5,11)+"\t"+atomicInteger);
        System.out.println(atomicInteger.compareAndSet(5,11)+"\t"+atomicInteger);
    }
}
