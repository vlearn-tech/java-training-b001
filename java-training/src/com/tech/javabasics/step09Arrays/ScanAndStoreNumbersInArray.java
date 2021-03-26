package com.tech.javabasics.step09Arrays;

import java.util.Scanner;

public class ScanAndStoreNumbersInArray {
	public static void main(String[] args) {
		int[] numbers = new int[5];

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter 5 numbers one by one");

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Enter next number : ");
			numbers[i] = scanner.nextInt();
		}

		scanner.close();

		System.out.println("Fourth number is : " + numbers[3]);

	}
}
