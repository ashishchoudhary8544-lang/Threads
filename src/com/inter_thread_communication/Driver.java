package com.inter_thread_communication;

class Shared {
	int num;
	boolean ready = false;

	synchronized void produce(int n) throws InterruptedException {
		while (ready) {
			wait();
		}
		num = n;
		System.out.println("Produced :" + n);
		ready = true;
		notify();
	}

	synchronized void consumer() throws InterruptedException {
		while (!ready) {
			wait();
		}
		System.out.println("Conumerd:" + num);
		ready = false;
		notify();
	}

}

public class Driver {

	public static void main(String[] args) {
		Shared shared = new Shared();
	

	}

}
