package com.tech.javabasics.step08BasicLooping;

import java.util.Scanner;

public class ConceptOfALoop {
	public static void main(String[] args) {
		System.out.println("Enter the table name which you want to print : ");
		Scanner scanner = new Scanner(System.in);
		int table = scanner.nextInt();
		scanner.close();

		int tableCounter;

		// THEORY

		// for (intialization; condition; increment/decrement) {

//		}

		// Scenario 1 - run a loop x number of times // counter based looping // for loop
		// Scenario 2- run a loop till you reach a business condition // rule based looping // while

		for (tableCounter = 1; tableCounter <= 10; tableCounter++) {
			System.out.println(String.format("%d x %d = %d", table, tableCounter, (table * tableCounter)));
		}

		// THEORY

//		tableCounter = 1; // initialization
//		loop {
//			if (tableCounter <= 10) { // condition
//				System.out.println(String.format("%d x %d = %d", table, tableCounter, (table * tableCounter)));
//				tableCounter++; // increment condition
//			}else { // exit condition
//				// break from loop;
//			}
//		}

	}
}
