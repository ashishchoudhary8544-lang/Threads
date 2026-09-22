package com.secound;

import java.util.Iterator;

class Task1 extends Thread {
	@Override
	public void run() {

		for (int i = 1; i <= 20; i++) {
			System.out.println(i + "Thread =" + Thread.currentThread().getId());

		}
	}
}

public class Driver2 {
	public static void main(String[] args) {

		Task1 t1 = new Task1();
		Task1 t2 = new Task1();
		t1.start();
		t2.start();

	}

}
