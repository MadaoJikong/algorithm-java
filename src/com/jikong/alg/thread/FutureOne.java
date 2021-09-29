package com.jikong.alg.thread;

import java.util.concurrent.*;

/**
 * future one
 *
 * @author cjc
 * @version 1.0.0
 * @date 2021/9/28 11:03
 */
public class FutureOne {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        Future<String> future = executor.submit(() -> {
            //Lambda 是一个 callable， 提交后便立即执行，这里返回的是 FutureTask 实例
            System.out.println("running task");
            Thread.sleep(10000);
            return "return task";
        });
        //前面的 Callable 在其他线程中运行着，可以做一些其他的事情
        System.out.println("do something else");
        try {
            System.out.println(future.isDone());
            //System.out.println(future.get(1, TimeUnit.SECONDS));
            //等待 future 的执行结果，执行完毕之后打印出来
            System.out.println(future.get());
            System.out.println(future.isDone());
        } catch (InterruptedException e) {
        } catch (ExecutionException e) {

        } finally {
            executor.shutdown();
        }
    }
}
