package com.yjk.demo.thread;

/**
 * @author yjk
 * @Description
 * @createTime 2023年03月07日 13:54:00
 */
public class ThreadTest {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
