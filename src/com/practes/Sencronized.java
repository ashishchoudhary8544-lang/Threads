package com.practes;

class Task {
	synchronized void doPayment() {

		for (int i = 0; i <= 10; i++) {
			System.out.println("Number :" + i + "---> " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}

	}

}

class PrinteThread extends Thread {
	Task task;

	public PrinteThread(Task task) {
		super();
		this.task = task;
	}

	public void run() {
		task.doPayment();
	}

}

public class Sencronized {
	public static void main(String[] args) {
		Task task1 = new Task();

		PrinteThread p1 = new PrinteThread(task1);
		p1.start();

		
		PrinteThread p2 = new PrinteThread(task1);
		p2.start();

	}

}
