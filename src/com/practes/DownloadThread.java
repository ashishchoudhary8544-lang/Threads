package com.practes;

public class DownloadThread extends Thread {

	@Override
	public void run() {
		System.out.println("File download...");
		
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

	}

}


class Main1{
	public static void main(String[] args) {
		DownloadThread t1= new DownloadThread();
		t1.start();
		
		Thread t2 = new Thread();
		t2.start();
		
		
	}
}