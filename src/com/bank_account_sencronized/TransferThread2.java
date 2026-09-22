package com.bank_account_sencronized;

public class TransferThread2 extends Thread{
	private BankAccount sender;
	private BankAccount receiver;
	
	
	public TransferThread2(BankAccount sender, BankAccount receiver) {
		super();
		this.sender = sender;
		this.receiver = receiver;
	}
	
	@Override
	public void run() {
		sender.transfer(receiver, 800);
	}
	

	
}
