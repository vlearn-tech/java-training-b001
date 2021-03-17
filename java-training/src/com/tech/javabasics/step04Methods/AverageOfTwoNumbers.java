package com.tech.javabasics.step04Methods;

import java.util.Scanner;

public class AverageOfTwoNumbers {
	public static void main(String[] args) {

		// Open a scanner for reading from console
		Scanner consoleScanner = new Scanner(System.in);

		// Scan the first number
		System.out.println("Enter the first number : ");
		int firstNumber = consoleScanner.nextInt();

		// Scan the second number
		System.out.println("Enter the second number : ");
		int secondNumber = consoleScanner.nextInt();

		// Close the scanner
		consoleScanner.close();

		// Print the average on the console
		System.out.println(String.format("Average of %d and %d is %f", firstNumber, secondNumber,
				calculateAverage(firstNumber, secondNumber)));

	}

	private static float calculateAverage(int firstNumber, int secondNumber) {
		return (float) Integer.sum(firstNumber, secondNumber) / 2;
	}
}

//up casting

// Be Careful! Bears Shouldn't Infuriate Large Flying Dragons
