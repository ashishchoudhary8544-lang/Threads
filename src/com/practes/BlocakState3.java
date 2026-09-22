package com.practes;

class Download1 implements Runnable {

	@Override
	synchronized public void run() {

		try {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName() + " Start Downloading");
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " Finish Downloading");

	}

}

public class BlocakState3 {
	public static void main(String[] args) {

		Download1 d = new Download1();

		Thread t1 = new Thread(() -> d.run(), "Thread-1");
		Thread t2 = new Thread(() -> d.run(), "Thread-2");
		Thread t3 = new Thread(() -> d.run(), "Thread-3");

		t1.start();
		t2.start();
		t3.start();

	}

}
