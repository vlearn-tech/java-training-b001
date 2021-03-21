package com.tech.javabasics.step07Operators;

public class UnaryOperators {
	public static void main(String[] args) {
		int a = 100; // assignment
		System.out.println("a = " + a); // 100

		System.out.println("a++ =" + a++); // 100
		System.out.println("a = " + a); // 101

//		a = 100;
		System.out.println("++a : " + ++a); // 102
		System.out.println("a = " + a); // 102

//		a = 100;
		System.out.println("a-- : " + a--); // 102
		System.out.println("a = " + a); // 101

//		a = 100;
		System.out.println("--a : " + --a); // 100
		System.out.println("a = " + a); // 100

		boolean isEligible = true;

		// Unary NOT operator
		if (!isEligible) {
			System.out.println("You are not eligible right now");
		}

	}
}
