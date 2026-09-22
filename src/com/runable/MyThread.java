package com.runable;

class Test implements Runnable {

	@Override
	public void run() {
		System.out.println("Download file...");
		
		 // Runnable does NOT return any value

	}

}

public class MyThread {

	public static void main(String[] args) {
		Test test =new Test();
		Thread t2 = new Thread(test);
		t2.start();
		System.out.println("User can do other work");

	}

}
