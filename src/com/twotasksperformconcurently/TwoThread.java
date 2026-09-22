package com.twotasksperformconcurently;

import java.util.Iterator;

class FirstThread extends Thread {
	@Override
	public void run() {

		for (int i = 1; i < 5; i++) {
			System.out.println("Play Music");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}

}

class SecoundThread extends Thread {

	@Override
	public void run() {

		for (int i = 1; i < 5; i++) {
			System.out.println("Download Files");

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}

	}
}

public class TwoThread {

	public static void main(String[] args) throws InterruptedException {

		
		FirstThread f1 = new FirstThread();
		SecoundThread s1 = new SecoundThread();
	
		f1.start();
		f1.join();
		s1.start();
		

	}

}
