package com.tech.javabasics.step07Operators;

public class TernaryOperators {
	public static void main(String[] args) {
		int age = 18;
		char citizenship = 'M';
		System.out.println("Old enough to cast vote? : " + (age >= 18 && citizenship == 'I' ? true : false));

		int a = 15;
		int b = 15;
		System.out.println("Greater number is : " + (a > b ? a : b));
	}
}
