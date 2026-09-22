package com.twotasksperformconcurently;

class Account {

	int balance = 1000;

	synchronized void withdraw(int amount) {
		if (balance >= amount) {
			System.out.println(Thread.currentThread().getName() + "is withdrawing" + amount);
			;

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			balance = balance - amount;

			System.out.println(Thread.currentThread().getName() + "completed withrawal");

			System.out.println("Remainng balance :" + balance);
		}
	}
}

public class Sencronized {

	public static void main(String[] args) throws InterruptedException {
		Account account = new Account();
		Thread t1 = new Thread(() -> {
			account.withdraw(700);
		}, "Thread-1");

		Thread t2 = new Thread(() -> {
			account.withdraw(100);
		}, "Thread-2");

		t1.start();
		t1.join();
		t2.start();

	}

}
