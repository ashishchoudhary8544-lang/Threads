package com.twotasksperformconcurently;

class DownloadThread extends Thread {

//	Agar system
//	mein single
//	CPU core hai,
//	to ek
//	particular moment
//	par CPU
//	generally ek
//	hi thread
//	ko execute
//	karta hai.
//	Operating system
//	ka scheduler
//	bahut fast
//	context switching
//	karta hai.

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {
			System.out.println("Download File .." + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}

	}
}

class MusicThread extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {

			System.out.println("Plyaing music..." + i);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}

		}
	}
}

public class Driver {

	public static void main(String[] args) {

		DownloadThread d1 = new DownloadThread();

		MusicThread m1 = new MusicThread();

		d1.start();
		m1.start();

	}

}
