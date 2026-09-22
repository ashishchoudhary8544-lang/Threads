package com.third_class;

class MyTask1 {

	synchronized public void printNumber() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Printing :" + i + "[" + Thread.currentThread().getName() + "]");

		}

	}

}

class PrintThread extends Thread {

	MyTask1 task;

	public PrintThread(MyTask1 _task) {
		this.task = _task;
	}

	@Override
	public void run() {

		task.printNumber();
	}
}

public class Practes {

	public static void main(String[] args) {

		MyTask1 t = new MyTask1();

		PrintThread p = new PrintThread(t);
		p.getName();
		p.start();

		PrintThread p1 = new PrintThread(t);
		p1.getName();
		p1.start();

	}

}
