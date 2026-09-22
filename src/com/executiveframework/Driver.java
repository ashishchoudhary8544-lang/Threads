package com.executiveframework;

import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Driver {
	public static void main(String[] args) {

		// Create a pool of 2 threads

		ExecutorService executor = Executors.newFixedThreadPool(1);

		executor.execute(() -> {
			System.out.println("Task 1 is running");

		});

		executor.execute(() -> {
			System.out.println("Task 2 is running");
		});

		executor.execute(() -> {
			System.out.println("Task 3 is running");
		});
		// Stop accespting new tasks
		executor.shutdown();

	}

}
