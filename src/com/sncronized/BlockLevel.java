package com.sncronized;

class Account {
	int balance = 1000;

	public void withraw(int amount) {
		
		synchronized (this) {
			balance =balance-amount;
			System.out.println("Withral  :"+amount + Thread.currentThread().getName());
			System.out.println("Remaning balance :"+balance + Thread.currentThread().getName());
			
		}
		
	}

}

public class BlockLevel {

	public static void main(String[] args) {
		
		Account a1 =new Account();
		
		Thread t1 = new Thread(()->{
			a1.withraw(100);
		});
		t1.start();
		
		Thread t2 = new Thread(() ->{
			a1.withraw(890);
		});
		t2.start();
		
	}

}
