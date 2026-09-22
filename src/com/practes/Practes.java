package com.practes;

import java.util.Iterator;

class MyTa implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {

			System.out.println(i);
		}

	}

}


public class Practes {

	public static void main(String[] args) throws InterruptedException {

		MyTa t = new MyTa();

		Thread t1 = new Thread(t);
		t1.start();

		t1.start();

	}

}
