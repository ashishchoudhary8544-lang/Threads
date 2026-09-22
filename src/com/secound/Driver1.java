package com.secound;

class EmailSending extends Thread {

	@Override
	public void run() {
//		When THREAD IS RUNNING state ->
//		Thread is doing work/task
//		from RUNNING to WAITING/BLOCKED
//		Once Waiting is over thread move to Runnable state
//		Once CPU allows,thread moved to RUNNING state
//		Once run method is complete by thread ,then it move to TERMINATED(Death)state

		System.out.println("Sending email..." + Thread.currentThread().getName());
	}

}

public class Driver1 {
	public static void main(String[] args) {

//		Once Thread object is created ,State =  NEW it means( Born state)
		EmailSending t1 = new EmailSending();

//		state : Runnable
		t1.start(); // NEW ->Runnable
		t1.start(); // state - Terminated (death)
//		It cam throw the -> IllegalThreadStateException
	}

}
