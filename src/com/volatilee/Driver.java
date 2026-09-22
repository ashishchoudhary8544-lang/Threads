package com.volatilee;

import java.lang.invoke.VolatileCallSite;

//volatile in Java ⭐⭐⭐⭐

//-> volatile is used in multithreading to make sure that when one thread changes a variable,
// other threads can see the latest value. 
//⭐ Very Important: volatile does NOT provide atomicity count++;

class ShareData {
	
 // volatile means every thread sees the latest value
	volatile int number =0;
	
}

public class Driver {

	public static void main(String[] args) throws InterruptedException {

		ShareData data = new ShareData();

		// Thread 1 : continuosly reads the value 
		Thread reader = new Thread(()->{
			
			int oldValue = data.number;
			
			while(true) {
				
				
				if(data.number !=oldValue) {
					
					System.out.println("Reader thread saw new value :"+data.number);
					
					oldValue=data.number;
				}
				
				if(data.number == 5 ) {
					break;
					
				}
			}
			
		});
		
		//Start reader thread
		reader.start();
		
		//Main thread changes the value
		
		for(int i=1; i<=5;i++) {
			Thread.sleep(1000);
			
			data.number=i;
			
			System.out.println("Main thread changed value to:"+i);
			
		}
		
		//wait for reader thread to finish
		reader.join();
		
		System.out.println("Program finished");
		
	}

}
