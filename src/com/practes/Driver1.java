package com.practes;

public class Driver1 extends Thread {

	@Override
	public void run() {

		System.out.println("My thread.ru()....executing the tsk..." + Thread.currentThread().getName());

	}

}
class Hellow {

	public static void main(String[] args) {

		System.out.println("HelloWord.main()START :" + Thread.currentThread().getName());

	}
}
