package com.practes;

import java.util.Iterator;

public class ThreadMethods extends Thread {

	@Override
	public void run() {
		for(int i=1;i<5;i++) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(i);
		
		}
		System.out.println("thread is runing");
	}
	public static void main(String[] args) {
		
		ThreadMethods obj = new ThreadMethods();
		
		obj.start();
	
		
	}


}

