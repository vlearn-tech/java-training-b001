package com.tech.javabasics.step07Operators;

import java.util.Scanner;

public class ArithmeticOperators {
	public static void main(String[] args) {
		// Scan two numbers
		Scanner scanner = new Scanner(System.in);

		// First Number
		System.out.println("Enter first number : ");
		int firstNumber = scanner.nextInt();

		System.out.println("Enter second number : ");
		int secondNumber = scanner.nextInt();

		scanner.close();

		System.out.println(String.format("The two numbers entered are %d and %d", firstNumber, secondNumber));

		// Print the following:
		// sum of the two numbers

		System.out.println(String.format("%d + %d = %d", firstNumber, secondNumber, (firstNumber + secondNumber)));

		// Difference between the first and second number
		System.out.println(String.format("%d - %d = %d", firstNumber, secondNumber, (firstNumber - secondNumber)));

		// Product of the two numbers
		System.out.println(String.format("%d x %d = %d", firstNumber, secondNumber, (firstNumber * secondNumber)));

		// Ratio of the first number with the second number
		System.out.println(
				String.format("%d divided by %d = %d", firstNumber, secondNumber, (firstNumber / secondNumber)));

		// What is the remainder when the first number is divided by the second number
		System.out.println(String.format("Remainder when %d is divided by %d = %d", firstNumber, secondNumber,
				(firstNumber % secondNumber)));

	}
}
