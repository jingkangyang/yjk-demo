package com.yjk.demo.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Date;
import java.util.concurrent.Callable;

/**
 * @author yjk
 * @Description
 * @createTime 2023年03月03日 15:54:00
 */
public class MyCallable implements Callable<Integer> {

    private static final Logger logger = LoggerFactory.getLogger(MyCallable.class);

    @Override
    public Integer call() throws Exception {
        logger.info(new Date() + "-线程id:" + Thread.currentThread().getId()+","+"线程名:" + Thread.currentThread().getName() + " start...");
        Thread.sleep(3000);
        logger.info(new Date() + "-线程id:" + Thread.currentThread().getId()+","+"线程名:" + Thread.currentThread().getName() + " end...");
        return 1;
    }
}
