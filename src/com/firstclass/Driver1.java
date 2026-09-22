package com.firstclass;

class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("run method task");

		System.out.println("MyThread : This code is excecuted by [" + Thread.currentThread().getName() + "]thread");
		System.out.println("This is my hello word[" + Thread.currentThread().getName() + "]thread");
	}

}

public class Driver1 {
	public static void main(String[] args) {

		System.out.println("Start");
		System.out.println("This code is executed by[" + Thread.currentThread().getName() + "]thread");
		System.out.println("This is my hello word"); // main

//		Main thread is executed only with the main method

		MyThread t1 = new MyThread();
		t1.start();
		MyThread t2 = new MyThread();
		t2.start();
		MyThread t3 = new MyThread();
		t3.start();

		System.out.println("End");
	}

}
