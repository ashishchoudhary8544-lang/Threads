package com.producerandconsumer;


class Task{
	int number;
	boolean isDataavailable =false;// by defalt it is false data is not avelable
	
	public synchronized void produce(int _num) throws InterruptedException {
		while(!isDataavailable) {
			
			wait();
			
		}
	}
	
}

public class Driver {

	public static void main(String[] args) {
		

	}

}
