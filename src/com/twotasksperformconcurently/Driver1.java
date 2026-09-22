package com.twotasksperformconcurently;

import java.util.Iterator;

class First implements Runnable {// Runnable is an interface in Java used to define the task that a thread will
									// execute.

	
	@Override
	synchronized public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println("Watch Movie");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}

class Secound implements Runnable {

	@Override
	synchronized public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println("Download File...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
	}

}

public class Driver1 {
	public static void main(String[] args) {

//		In Runnable Interface - “Task alag, Thread alag”

		First first = new First();
		Secound secount = new Secound();

		Thread t1 = new Thread(first);
		t1.start();

		Thread t2 = new Thread(secount);
		t2.start();

	}

}
