package com.yjk.demo.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author yjk
 * @Description
 * @createTime 2023年03月07日 13:53:00
 */
public class MyThread extends Thread{

    private static final Logger logger = LoggerFactory.getLogger(MyThread.class);

    @Override
    public void run() {
        logger.info("Thread线程运行中。。。");
    }
}
