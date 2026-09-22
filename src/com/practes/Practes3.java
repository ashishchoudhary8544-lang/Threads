package com.practes;

import java.util.Iterator;

class FirstClass extends Thread {
	@Override
	public void run() {
		SecoundClass s = new SecoundClass();
		s.start();

		for (int i = 1; i < 5; i++) {
			System.out.println(i + "->" + Thread.currentThread().getName());
		}

		
	}
}


class SecoundClass extends Thread {
	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "->" + Thread.currentThread().getName());
		}

	}
}

public class Practes3 {

	public static void main(String[] args) {

		FirstClass f = new FirstClass();
		f.start();

		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "->" + Thread.currentThread().getName());

		}

	}

}
