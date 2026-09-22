package com.bank_account_sencronized;

public class Driver {
	public static void main(String[] args) {

		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();
		Thread phonePay = new TransferThread1(account1, account2);
		phonePay.start();

		Thread gpay = new TransferThread2(account1, account2);

		gpay.start();

//		phonePay.join();
//		gpay.join();

		System.out.println("Account 1:"+account1.getBalance());
		System.out.println("Account 2:"+account2.getBalance());

	}

}
