package com.practes;

class A1 extends Thread {

	@Override
	synchronized public void run() {

		System.out.println("A1 Thread");
		
		notify();
		

	}

}

class B implements Runnable {

	@Override
	synchronized public void run() {
		System.out.println("Download Song :" + Thread.currentThread().getName());
		try {
//			Thread.sleep(2000); // sleep can not relese the lock it can puse a spacific time
			wait(); // wait goes to a waiting stae and relese the lock
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

}

public class Practes2 {

	public static void main(String[] args) {

		

		B obj = new B();
		Thread t1 = new Thread(obj);
		t1.start();

		Thread t2 = new Thread(obj);
		t2.start();
		
		A1 a = new A1();
		a.start();

	}

}
