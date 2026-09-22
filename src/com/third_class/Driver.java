package com.third_class;

class Task implements Runnable {
	
//	Runnable Interface is more flaxeble 

	@Override
	public void run() {
		System.out.println("Task.run()");

	}

}

public class Driver {
	public static void main(String[] args) {

		Task t1 = new Task();

		Thread t = new Thread(t1);
		t.start();

	}
}
