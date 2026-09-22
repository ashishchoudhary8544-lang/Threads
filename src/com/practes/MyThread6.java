package com.practes;

public class MyThread6 extends Thread{
	
	@Override
	public void run() {
		System.out.println("Download Thread...");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		MyThread6 t1=  new MyThread6();
		System.out.println(t1.getState());
		
		t1.start();// Start the Thread
		System.out.println(t1.getState());
		Thread.sleep(1000);
	
		
		t1.join();
		System.out.println(t1.getState());
		
	
		
		
	}

	
}
