package com.practes;

class Task1 extends Thread{
	
	@Override
	public void run() {
		
		A t2 =new A();
		t2.start();
	
		for (int i = 0; i < 10; i++) {
			System.out.println("number : "+i+" : "+Thread.currentThread().getName());
		}
		System.out.println("run method do some task");
		
	}
	
}


class A extends Thread {
	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("number : "+i+" : "+Thread.currentThread().getName());
		}
		System.out.println(" A do some thing");
	}
}

public class Practes1 {
	public static void main(String[] args) throws InterruptedException {
		
		Task1 t1  =new Task1();
		
		t1.start();
		for (int i = 0; i < 10; i++) {
			Thread.sleep(200);
			System.out.println("number : "+i+" : "+Thread.currentThread().getName());
		}
		System.out.println("Practes1.main()");
	}

}
