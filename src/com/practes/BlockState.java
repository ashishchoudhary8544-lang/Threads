
package com.practes;

class Download {

// who  does the sencronized control that -> for the object lock

	synchronized void download() {
		System.out.println(Thread.currentThread().getName() + "Start downloading");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "finished downloading");

	}
}

public class BlockState {

	public static void main(String[] args) {

		Download d = new Download();

		Thread t1 = new Thread(() -> d.download(), "Thread -1");
		Thread t2 = new Thread(() -> d.download(), "Thread -2");

		t1.start();
		t2.start();

	}

}
