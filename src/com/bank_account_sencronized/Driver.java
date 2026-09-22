package com.bank_account_sencronized;

public class Driver {
	public static void main(String[] args) {

		Account1 a1 = new Account1();

		Thread t1 = new Thread(() -> a1.withrawl(900));
		t1.start();

		Thread t2 = new Thread(() -> a1.withrawl(90));
		t2.start();

	}

}
