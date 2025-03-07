package com.tech.javabasics.step08basiclooping;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
		System.out.println("Enter the table name which you want to print : ");
		Scanner scanner = new Scanner(System.in);
		int table = scanner.nextInt();
		scanner.close();

		// Start my counter
		int tableCounter = 1;

		System.out.println("Start the printing...");
		// Loop while the condition is true
		do {
			// what you want to do repeatedly
			System.out.println(String.format("%d x %d = %d", table, tableCounter, (table * tableCounter)));
			tableCounter++; // increment of the counter
		} while (tableCounter <= 10);
		System.out.println("Printing Completed...");

	}
}
