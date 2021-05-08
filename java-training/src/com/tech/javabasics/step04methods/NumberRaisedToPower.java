package com.tech.javabasics.step04methods;

import java.util.Scanner;

public class NumberRaisedToPower {
	public static void main(String[] args) {

		// Open a scanner for reading from console
		Scanner consoleScanner = new Scanner(System.in);

		// Scan the first number
		System.out.println("Enter the number : ");
		int base = consoleScanner.nextInt();

		// Scan the second number
		System.out.println("Enter the power to which you want to raise : ");
		int exponent = consoleScanner.nextInt();

		// Close the scanner
		consoleScanner.close();

		// Print the average on the console
		System.out.println(String.format("Number %d raised to the power of %d is %d", base, exponent,
				(long) Math.pow(base, exponent)));

	}

}

//Be Careful! Bears Shouldn't Infuriate Large Flying Dragons

//down casting
