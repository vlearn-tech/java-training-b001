package com.tech.javabasics.step08BasicLooping;

import java.util.Scanner;

public class GenericLoop {
	public static void main(String[] args) {
		System.out.println("Enter the table name which you want to print : ");
		Scanner scanner = new Scanner(System.in);
		int table = scanner.nextInt();
		scanner.close();

		// Start my counter
		int tableCounter = 1;

		// Infinite Loop and handle everything manually
		while (true) {
			// condition under which the repeatable task needs to be executed
			if (tableCounter <= 10) {
				// what you want to do repeatedly
				System.out.println(String.format("%d x %d = %d", table, tableCounter, (table * tableCounter)));

				tableCounter++; // increment of the counter
			} else {
				break; // exit from loop once the counter has reached 11. If you do not break, then
						// this loop will stay infinite
			}
		}
	}
}
