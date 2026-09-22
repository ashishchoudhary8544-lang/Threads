package com.twotasksperformconcurently;

import com.practes.Sencronized;

class DownloadMusic extends Thread {

	@Override
	 public  void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Download Music...");

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}

	}
}

class YoutubeOpen extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Youtube Opean...");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

}

class SharePhotos extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Share Photos...");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}

public class Main2 {

	public static void main(String[] args) {
		
		DownloadMusic d1 =new DownloadMusic();
		YoutubeOpen y1= new YoutubeOpen();
		SharePhotos s1= new SharePhotos();
		
		d1.start();
		y1.start();
		s1.start();

	}

}
