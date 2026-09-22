package com.twotasksperformconcurently;

import java.util.Iterator;

class Video extends Thread {// Thread is a class in Java used to create and run a thread.

	@Override
	public void run() {

		for (int i = 1; i < 5; i++) {
			System.out.println("Watch Video");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
		
				e.printStackTrace();
			}

		}

	}
}

class Instagram extends Thread {

	@Override
	public void run() {

		for (int i = 1; i < 5; i++) {
			System.out.println("Instagram Reel");
			try {

				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}

class Youtube extends Thread {

	@Override
	public void run() {

		for(int i=1; i<5;i++) {
			System.out.println("Yotube Shorts");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

}
}
public class Practes {
	public static void main(String[] args) throws InterruptedException {

		Video video = new Video();
		Instagram insta = new Instagram();
		Youtube youtuble = new Youtube();

		video.start();
		video.join();//Ek thread doosre thread ke complete hone ka wait karega.
		insta.start();
		video.join();//join() means: One thread waits for another thread to finish.
		youtuble.start();

	}

}
