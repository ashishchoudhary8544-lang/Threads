package com.firstclass;

import java.util.Iterator;

class MyThread2 extends Thread {

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println("Download");
		}
	}
}

class MyThread3 extends Thread {

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println(" Music");
		}
	}
}

public class Driver2 {

	public static void main(String[] args) {
		System.out.println("This code is executed by :" + Thread.currentThread().getName());

		MyThread2 t1 = new MyThread2();
		t1.start();

		MyThread3 t2 = new MyThread3();
		t2.start();

	}

}
