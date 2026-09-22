package com.third_class;

class MyTask {

	synchronized public void printNumber() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Printing :" + i + "[" + Thread.currentThread().getName() + "]");

		}

	}

}

class PrinterThread extends Thread {
//one thread at a time on  particuler object
//	Synchronization means one thread at a time on shared objects. 
//	**---- That means if two different objects are passing in different threads and the synchronized method is same then both will execute at a time. 
//	Synchronization means allowing only one thread at a time to access a shared object/resource.
	MyTask task;

	public PrinterThread(MyTask _task) {
		this.task = _task;
	}

	@Override
	public void run() {

		task.printNumber();
	}

}

public class Driver3 {

	public static void main(String[] args) {

		MyTask a1 = new MyTask();

		PrinterThread t1 = new PrinterThread(a1);
		t1.setName("FirstThread");
		t1.start();

		PrinterThread t2 = new PrinterThread(a1);
		t2.setName("Secound Thread");
		t2.start();

	}

}
