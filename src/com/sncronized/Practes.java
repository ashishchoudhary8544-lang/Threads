package com.sncronized;

class Count {

	int count = 0;

	public void increment() {
		count++;
		System.out.println(count);
	}

}

//	Synchronization means one thread at a time on shared objects. 
//**---- That means if two different objects are passing in different threads and the synchronized method is same then both will execute at a time. 
//Synchronization means allowing only one thread at a time to access a shared object/resource.

public class Practes {
	public static void main(String[] args) {

		Count c = new Count();

		Thread t = new Thread(() -> {
			for (int i = 0; i <= 1000; i++) {
				c.increment();

			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i <= 1000; i++) {
				c.increment();
			}
		});

		t.start();
		t2.start();

	}

}
