package com.yjk.prj.demo.thread;

/**守护线程Demo
 * @author yangjingkang
 * 2019年9月8日 上午12:12:45
 */
public class ThreadDaemon extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("守护线程："+i);
		}
	}
	
	public static void main(String[] args) {
		ThreadDaemon th = new ThreadDaemon();
		th.setDaemon(true);
		th.start();
     
		Thread th1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("用户线程："+i);
				}
			}
		});
		th1.start();
	}
}