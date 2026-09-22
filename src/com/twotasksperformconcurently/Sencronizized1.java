package com.twotasksperformconcurently;

class MyAccount {

	int balance = 1000;

synchronized void withraw(int amount) {

		if (amount <=balance ) {
			System.out.println(Thread.currentThread().getName() + "is withdrawing" + amount);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}balance = balance - amount;
		System.out.println("Remaning balance:"+balance);

	}

}

public class Sencronizized1 {
	public static void main(String[] args) {

		MyAccount m1 = new MyAccount();

		Thread t1 = new Thread(() -> {
			m1.withraw(900);

		});

		Thread t2 = new Thread(() -> {
			m1.withraw(100);
		});
		
		t1.start();
		t2.start();

	}

}
