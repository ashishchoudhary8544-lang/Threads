package com.practes;

class MyTask extends Thread {

	@Override
	public void run() {
		System.out.println("Thread is running");
	}

}

public class Driver {

	public static void main(String[] args) {

		MyTask task = new MyTask();

		Thread t1 = new Thread(task);

		t1.start();// start() creates a new thread and then JVM executes run() on that thread.

	}

}
