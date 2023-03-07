package com.yjk.demo.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author yjk
 * @Description
 * @createTime 2023年03月03日 15:53:00
 */
public class ThreadCallableTest {

    private static final Logger logger = LoggerFactory.getLogger(ThreadCallableTest.class);

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Integer sum = 0;
        MyCallable myCallable = new MyCallable();
        for (int i = 0; i < 10; i++) {
            FutureTask<Integer> futureTask = new FutureTask<>(myCallable);
            new Thread(futureTask).start();
            // get会阻塞线程
            sum += futureTask.get();
        }
        logger.info(Thread.currentThread().getId() + "-" + Thread.currentThread().getName() + ",sum=" + sum);
    }
}
