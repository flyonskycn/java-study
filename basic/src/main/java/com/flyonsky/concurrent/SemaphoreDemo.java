package com.flyonsky.concurrent;

import java.util.Random;
import java.util.concurrent.*;

/**
 * 信号量样例
 * @author luowengang
 * @date 2020/9/11
 */
public class SemaphoreDemo {
    private static final int THREAD_COUNT = 30;

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = new ThreadPoolExecutor(3, 5, 10, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
        final Semaphore sep = new Semaphore(2);
        for(int i =0; i < THREAD_COUNT; i ++){
            executorService.submit(()->{
                try{
                    sep.acquire();
                    // 模拟业务耗时
                    Thread.sleep(Math.abs (new Random().nextInt(20)));
                    System.out.println(Thread.currentThread().getName() + " access pools");
                }catch (InterruptedException e){
                    System.out.println(Thread.currentThread().getName() + " thread interrupted ");
                }finally {
                    sep.release();
                }
            });
        }
        executorService.shutdown();

        while (!executorService.awaitTermination(1,TimeUnit.SECONDS)){
            System.out.println("thread pool is running");
        }
        System.out.println("main thread exit" );
    }
}
