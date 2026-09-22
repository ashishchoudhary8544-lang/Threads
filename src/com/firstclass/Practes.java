package com.firstclass;

class DownloadinfFile implements Runnable {

	@Override
	public void run() {

		for (int i = 1; i < 5; i++) {
			System.out.println("Downloading File");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}

class SendingEmail implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println("Sending email...");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}

class SavingData implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println("Saving data...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
	}
}

public class Practes {

	public static void main(String[] args) {

		Thread t1 = new Thread(new DownloadinfFile());
		Thread t2 = new Thread(new SendingEmail());
		Thread t3 = new Thread(new SavingData());

		t1.start();
		t2.start();
		t3.start();

	}

}
