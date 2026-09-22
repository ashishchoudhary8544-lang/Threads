package com.practes1;

import java.util.concurrent.CountDownLatch;

class Conter implements Runnable {

	private int count;

	@Override
	public void run() {

		for (int i = 1; i <= 1000; i++) {

			synchronized (this) {
				count++;
			}

		}

	}

	public int getCount() {
		return count;
	}

}

public class Driver {

	public static void main(String[] args) throws InterruptedException {

		Conter c = new Conter();

		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Final Count :" + c.getCount());

	}

}
