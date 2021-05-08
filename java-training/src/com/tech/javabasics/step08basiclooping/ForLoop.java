package com.tech.javabasics.step08basiclooping;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		System.out.println("Enter the table name which you want to print : ");
		Scanner scanner = new Scanner(System.in);
		int table = scanner.nextInt();
		scanner.close();

		System.out.println("Start the printing...");

		for (int tableCounter = 1; tableCounter <= 10; tableCounter++) {
			System.out.println(String.format("%d x %d = %d", table, tableCounter, (table * tableCounter)));
		}

		System.out.println("Printing Completed...");

	}
}
