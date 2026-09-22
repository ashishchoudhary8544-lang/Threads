package com.practes;

class DownlodMovi {

	synchronized void download() {

		System.out.println(Thread.currentThread().getName() + "Star downloading");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
System.out.println(Thread.currentThread().getName()+"Finis Dwonloading");
	}

}

public class BlockState2 {

	public static void main(String[] args) {

		DownlodMovi d1 = new DownlodMovi();

		Thread t1 = new Thread(() -> d1.download(), "Thread -1");
		Thread t2 = new Thread(() -> d1.download(), "Thread-2");

		t1.start();
		t2.start();

	}

}
