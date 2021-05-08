package com.tech.javabasics.step07operators;

public class RelationalOperators {
	public static void main(String[] args) {
		int a = 650;
		int b = 650;

		printLesserOfTwoNumbers(a, b);

	}

	private static void printLesserOfTwoNumbers(int a, int b) {
		int lesserNumber = 0;

		if (a != b) {
			if (a < b) {
				lesserNumber = a;
			} else if (a > b) {
				lesserNumber = b;
			}
		} else {
			lesserNumber = a;
		}

//		
//		if (a < b) {
//			lesserNumber = a;
//		} else if (a > b) {
//			lesserNumber = b;
//		} else if (a == b) {
//			lesserNumber = a;
//		}
		System.out.println("Lesser number is : " + lesserNumber);
	}
}
