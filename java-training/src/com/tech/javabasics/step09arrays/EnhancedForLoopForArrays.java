package com.tech.javabasics.step09arrays;

public class EnhancedForLoopForArrays {
	public static void main(String[] args) {
		System.out.println("Start of program");

		Integer[] numbers = { 1, 4, 6, 3, 6, 8, 3, 9, 4 };

		System.out.println("Looping using normal for loop");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		System.out.println("Looping using enhanced for loop");
		for (Integer thisValue : numbers) {
			System.out.println(thisValue);
		}

		System.out.println("End of program");
	}
}
