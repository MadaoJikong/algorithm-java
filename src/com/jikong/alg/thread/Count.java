package com.jikong.alg.thread;

import java.util.concurrent.CountDownLatch;

/**
 * 测试线程
 *
 * @author chengjunchao
 * @version 1.0.0
 * @date 2022/2/21 16:16
 */
public class Count {
    public static void main(String[] args) {
        int count = 5;
        CountDownLatch countDownLatch = new CountDownLatch(count);

        for (int i = 0; i < count; i++) {
            int finalI = i;
            Thread thread = new Thread() {
                @Override
                public void run() {
                    super.run();
                    try {
                        Thread.sleep(2000 * (finalI + 1));
                        System.out.println("线程 " + finalI + "完");
                    } catch (Exception e) {
                    } finally {
                        countDownLatch.countDown();
                    }
                }
            };
            thread.start();
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("完成");
    }
}
