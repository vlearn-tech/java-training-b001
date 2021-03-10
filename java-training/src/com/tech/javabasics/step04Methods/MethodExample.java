package com.tech.javabasics.step04Methods;

public class MethodExample {

	public static void main(String[] args) {

	}

	public static int getSumOfTwoNumbers(int number1, int number2) {
//		int sum = number1 + number2;
		return Integer.sum(number1, number2);
	}

	public static int findDiffernceBetweenTwoNumbers(int a, int b) {
		return Math.abs(a - b);
	}

	public static void printProductOfTwoNumbers(int a, int b) {
		System.out.println(String.format("Product of %d and %d is %d", a, b, a * b));
	}

	public static void printTheName(String name) {
		System.out.println(name);
	}

//	{access level} {static} {return type} {name of method} {method arguments} {<method logic>}

}
