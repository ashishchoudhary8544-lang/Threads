package com.practes;

class DownloadTask implements Runnable{//Runnable → KAAM kya karna hai

	@Override
	public void run() {
		System.out.println("File Downloading...");
		
	}
	
}

public class Main {
	public static void main(String[] args) {
		DownloadTask task = new DownloadTask();
		
		Thread t1 = new Thread(task);
		
		t1.start();//start() internally run() ko execute karwata hai.
		System.out.println("User can do other work...");
		
	}

}

//Runnable → KAAM kya karna hai
//Thread   → KAAM kis thread par chalega ,Thread ek class hai jo us task ko execute karne ke liye thread provide karti hai.
//start()  → Thread ko start karta hai
//run()    → Actual kaam rakhta hai
