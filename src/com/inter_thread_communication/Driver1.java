package com.inter_thread_communication;

class FrientCall {

	private boolean available = false;

	synchronized void call() {

		try {
			while (!available) {

				System.out.println(
						"Friend Kartik call he say  : Hi bro chal gumana  : Me thode dar bad chalta ha 30 min ka bad ok ready ho ja ok");
				wait();
			}
			System.out.println("After 30 min I am calling my frient  : chal bro ma a rha hu  ");
			available = false;
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	synchronized void reciveCall() {

		System.out.println(" Friend ma  ready ho rha hu");

		System.out.println("I am ready ");
		available = true;
		notify();

	}

}

public class Driver1 {

	public static void main(String[] args) {

		FrientCall call1 = new FrientCall();

		Thread t1 = new Thread(() -> {
			call1.call();
		});

		Thread t2 = new Thread(() -> {
			call1.reciveCall();
		});

		t1.start();
		t2.start();

	}

}
