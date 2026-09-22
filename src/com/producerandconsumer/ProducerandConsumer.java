package com.producerandconsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class ProducerandConsumer {
	public static void main(String[] args) {

		// Create a queue with capacity of 5
		// Producer will put data here
		// Consumer will take data from here
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(5);

     //------ PRODUCER-------

		Thread producer = new Thread(() -> {

			try {
				// Produce number from 1 to 5
				for (int i = 1; i <= 5; i++) {

					// Put produced data into the queue
					queue.put(i);

					System.out.println("Produced :" + i);
				}

			} catch (Exception e) {

				// If producer thread is interrupted
				System.out.println("Producer interrupted");

				// Restore the interrupted status
				Thread.currentThread().interrupt();

			}

		});

		// -------CONSUMER------

		Thread consumer = new Thread(() -> {

			try {

				// Consume 5 number

				for (int i = 1; i <= 5; i++) {

					// Take data from the queue

					int data = queue.take();
					System.out.println("Consumed :" + data);

				}

			} catch (Exception e) {

//				If consumer thread is interrupted
				System.out.println("Comsumer interrupted");

				// Restore the interrupted status
				Thread.currentThread().interrupt();

			}

		});

		// Start Producer thread
		producer.start();

		// Start consumer thread
		consumer.start();
	}

}
