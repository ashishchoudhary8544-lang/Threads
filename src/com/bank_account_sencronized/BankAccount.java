package com.bank_account_sencronized;

class BankAccount {

	private int balance = 1000;

	 public void transfer(BankAccount receiver, int amount) {

		if (amount <= balance) {
			System.out.println("[" + Thread.currentThread().getName() + "] checked balance :" + balance);

			balance -= amount;
			receiver.balance = receiver.balance + amount;
			System.out.println("Withrawl Blance :" + balance + Thread.currentThread().getName());

		} else {
			System.out.println("[" + Thread.currentThread().getName() + "] Insufficient Balance");
		}
	}

	public int getBalance() {
		return balance;
		}
	}