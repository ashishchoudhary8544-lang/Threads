package com.inter_thread_communication;

class Food {

	private boolean available = false;

	// Consumer
	synchronized void eat() {
		try {

			// Food available nahi ha
			while (!available) {

				System.out.println("Consumer : Food nahi hai waiting...");

				wait();
			}
			System.out.println("Consumer : Food kha raha hai");

			available = false;

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// Producer

	synchronized void prosucer() {

		System.out.println("Producer Food bana raha hai...");

	

		System.out.println("Producer : Food ready hai");
		available = true;
		notify();
		
	}

}

public class Main {
	public static void main(String[] args) {

		Food food = new Food();

//		 Consumer thread
		Thread consumer = new Thread(() -> {
			food.eat();
		});

//    Producer Thread
		Thread producer = new Thread(() -> {
			food.prosucer();
		});

		consumer.start();
		producer.start();

	}

}
