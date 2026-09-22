package com.secound;

class Task extends Thread {

	@Override
	public void run() {
//	Thread can enter the run() method and Thread perform some task  that state - is a Running state 
		try {
			wait(1000); // Once waiting is over then thread move to Runnable stae ,Once CPU allows
						// ,thread moves to RUNNING state and Once run() method is complete then it move
						// to termitate state
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println("Perform some task");
	}

}

public class Driver {

	public static void main(String[] args) {

		Task t1 = new Task();// created a thred these Thread state is a NEW state
		t1.start(); // this state is Runnnable state

	}

}
