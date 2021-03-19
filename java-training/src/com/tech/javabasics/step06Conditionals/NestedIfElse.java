package com.tech.javabasics.step06Conditionals;

import java.util.Scanner;

public class NestedIfElse {
	public static void main(String[] args) {

		// Get the scanner
		Scanner scanner = new Scanner(System.in);

		// Scan name of the person
		System.out.println("Enter Name: ");
		String name = scanner.nextLine();

		// Scan age of the person
		System.out.println("Enter age: ");
		int age = scanner.nextInt();

		// Close the scanner
		scanner.close();

		// Find if person is senior citizen
		boolean isSeniorCitizen = getSeniorCitizenStatus(age);

//		System.out.println("Senior Citizen Status: " + isSeniorCitizen);

		// Print the senior Citizen Status
		if (isSeniorCitizen == true) {
			System.out.println(String.format("%s, you are a Senior Citizen.", name));

			if (age > 80) {
				System.out.println("You are eligible for additional 2% interest rate");
			} else {
				System.out.println("You are eligible for additional 1% interest rate");
			}

		} else {
			System.out.println(String.format("%s, you are not yet a Senior Citizen.", name));
			if (age < 22) {
				System.out.println("You are elgible for a concession on student loans");
			}
		}

		if (!name.startsWith("V")) {
			System.out.println("This is a hanging else statement for a person whose name does not start with V");
		}

	}

	private static boolean getSeniorCitizenStatus(int age) {
		if (age > 60) {
			return true;
		}

		return false;
	}

}
