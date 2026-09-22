package com.twotasksperformconcurently;

class SavingAccount {

	int balance = 1000;

	synchronized void widthraw(int amount) {

		if (balance >= amount) {
			System.out.println(Thread.currentThread().getName() + "Withraw" + amount);
			balance = balance - amount;

			System.out.println(Thread.currentThread().getName() + "Complit Withrwal");
			System.out.println(Thread.currentThread().getName() + "Remaning Balance :" + balance);

		}
	}

}

public class Sencro {
	public static void main(String[] args) {
		SavingAccount obj1 = new SavingAccount();

		Thread t1 = new Thread(() -> {
			obj1.widthraw(900);

		});

		Thread t2 = new Thread(() -> {
			obj1.widthraw(10);
		});

		t1.start();
		t2.start();

	}

}
