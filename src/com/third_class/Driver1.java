package com.third_class;

class Task1 implements Runnable {

	@Override
	public void run() {

		for (int i = 1; i < 10; i++) {
			if (i == 5) {

				try {
					System.out.println("Sleep");

					Thread.sleep(5000);
					System.out.println("Sleeping ti over... i just woke up..stated work again");
				} catch (InterruptedException e) {

					e.printStackTrace();
				}

			}
			System.out.println("Priting :" + i);
		}

	}
}

public class Driver1 {

	public static void main(String[] args) {

		Task1 t1 = new Task1();

		Thread t2 = new Thread(t1);
		t2.start();

	}

}
