package com.practes;

public class MyThread4 extends Thread{
	
	@Override
	public void run()
	{
		System.out.println("Running");
		
	}
	public static void main(String[] args) throws InterruptedException {
		
		MyThread4 t1= new MyThread4();
		System.out.println(t1.getState());
		
		t1.start();
		System.out.println(t1.getState());
		Thread.sleep(100);
		
		t1.join();
		System.out.println(t1.getState());
		
	}

}
