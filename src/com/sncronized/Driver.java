package com.sncronized;

class Task {

	public synchronized void printNumber() {
		for (int i = 1; i < 10; i++) {
			System.out.println("Printing :" + i + Thread.currentThread().getName());

		}

	}

}

class PrintThread extends Thread {

	Task task;

	public PrintThread(Task task) {

		this.task = task;
	}

	@Override
	public void run() {
		task.printNumber(); // task object can take a 1 lock

	}
}

public class Driver {

	public static void main(String[] args) {
		
//   Synchronization means allowing only one thread at a time to access a shared object/resource.
		
		Task t = new Task(); // lock = 1 // Account 1

		PrintThread p1 = new PrintThread(t);
		p1.start();

//		Task t1 = new Task(); // lock = 1 // Account 2
		PrintThread p2 = new PrintThread(t);
		p2.start();

	}

}
