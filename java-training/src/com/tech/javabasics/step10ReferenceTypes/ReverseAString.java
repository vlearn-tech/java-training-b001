package com.tech.javabasics.step10ReferenceTypes;

import java.util.Scanner;

public class ReverseAString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a phrase of your choice...");
		StringBuilder inputText = new StringBuilder(scanner.nextLine());
		scanner.close();

		System.out.println("Input Text : " + inputText);
		System.out.println("Reversed string is : " + inputText.reverse());

		// Array way of printing the string in reversed manner
//		char[] inputArray = inputText.toCharArray();
//		for (int i = inputArray.length - 1; i >= 0; i--) {
//			System.out.print(inputArray[i]);
//		}
	}
}
