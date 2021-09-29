package com.jikong.alg.thread;

import java.util.concurrent.CompletableFuture;

/**
 * complete
 *
 * @author cjc
 * @version 1.0.0
 * @date 2021/9/28 14:48
 */
public class Complete {

    public static void main(String[] args) {
        // 参考 https://blog.csdn.net/qq_31865983/article/details/106137777
        
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hello");

    }
}
