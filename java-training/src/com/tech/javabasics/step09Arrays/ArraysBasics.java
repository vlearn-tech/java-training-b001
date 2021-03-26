package com.tech.javabasics.step09Arrays;

public class ArraysBasics {
	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 20;
		int number3 = 30;
		int number4 = 40;
		int number5 = 50;

		System.out.println(number1); // 10
		System.out.println(number2); // 20

		int[] numbers = { 100, 200, 300, 400, 500 }; // No size is specified.

		numbers[4] = 176;

		System.out.println(numbers[0]); // 100
		System.out.println(numbers[1]); // 200
		System.out.println(numbers[4]); // 500

		int[] newNumbers = new int[5];
		newNumbers[0] = 1000;
		newNumbers[2] = 3000;
		newNumbers[4] = 5000;
		newNumbers[1] = 2000;
		newNumbers[3] = 4000;

		System.out.println(newNumbers[0]); // 1000
		System.out.println(newNumbers[1]); // 2000
		System.out.println(newNumbers[4]); // 5000

	}
}
