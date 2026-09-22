package com.bank_account_sencronized;

class Account1 {

	private int balance = 1000;

	public void withrawl(int amount) {

		if (amount <= balance) {

			balance -= amount;
			System.out.println("Withrawl Blance :" + balance + Thread.currentThread().getName());
		}
	}

}
