package com.bank_account_sencronized;

class Myhread extends Thread{
	public void run() {
		System.out.println("Myhread.run()");
	}
}
public class Driver2 {

	public static void main(String[] args) {
		Myhread myhread = new Myhread();
		myhread.start();

	}

}
