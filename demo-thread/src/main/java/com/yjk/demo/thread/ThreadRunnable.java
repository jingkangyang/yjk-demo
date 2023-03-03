package com.yjk.demo.thread;

/**实现Runable创建线程Demo
 * @author yangjingkang
 * 2019年9月8日 上午12:13:36
 */
public class ThreadRunnable implements Runnable{
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		ThreadRunnable thRun = new ThreadRunnable();
		Thread th = new Thread(thRun);
		th.start();
	}

}
