package com.tech.javabasics.step08basiclooping;

import java.util.Scanner;

public class GuessTheFactorUsingWhileLoop {
	public static void main(String[] args) {
		// Keep scanning for numbers and find if 1234 exactly divides that number or
		// not.
		// Stop when the entered number is 0

		int referenceNumber = 123456;

		int scannedNumber;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your first guess or enter 0 to quit : ");

		scannedNumber = scanner.nextInt();

		while (scannedNumber != 0) {
			if (referenceNumber % scannedNumber == 0) {
				System.out.println("Bingo! You found a perfect factor!!. Enter the next guess or enter 0 to quit : ");
			} else {
				System.out.println(
						"Sorry, this is not a factor. Want to try again? Enter the next guess or enter 0 to quit : ");
			}
			scannedNumber = scanner.nextInt();
		}

		System.out.println("Thanks for playing. Hope you enjoyed this game");

		scanner.close();

	}
}
