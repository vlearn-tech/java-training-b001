package com.tech.javabasics.step05acceptinginputfromconsole;

import java.util.Scanner;

/*
 *Program to read the name from Console and print the name with a welcome message
 *
 *Input: name
 *Output: Welcome, name
 * 
 */

public class FirstConsoleProgram {
	public static void main(String[] args) {

		// Step 1 - define a variable to store your name
		String name = "ABCD";
		int age = 0;

		// Step 2 - read the name from the console
		// Step 2a - use a scanner for the console
		Scanner consoleScanner = new Scanner(System.in);

		// Step 2b - using the scanner read the next line entered by the user
		name = consoleScanner.next();
		age = consoleScanner.nextInt();
		consoleScanner.close();

		// Step 3 - write the welcome message along with the name
		System.out.println("Welcome, " + name + ". You are " + age + " years old");
	}
}
