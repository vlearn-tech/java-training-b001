package com.tech.javabasics.step05acceptinginputfromconsole;

import java.util.Scanner;

import com.tech.javabasics.step04methods.MethodInvocation;

public class ConsoleInput {
	public static void main(String[] args) {
		String message = getMessageFromConsole();
		printName(message);
		getFromConsoleAndPrintSeniorCitizenshipStatus();
	}

	private static String getMessageFromConsole() {
		Scanner sc = new Scanner(System.in); // scan the console
		System.out.println("Enter your message here : ");
		String scannedMessage = sc.nextLine();
		sc.close();
		return scannedMessage;
	}

	private static void printName(String message) {
		System.out.println(String.format("\nThe message you entered is: %s", message));
	}

	private static void getFromConsoleAndPrintSeniorCitizenshipStatus() {
		Scanner scanner = new Scanner(System.in); // scan the console
		System.out.println("Enter your name here : ");
		String name = scanner.nextLine();
		System.out.println("Enter your age here : ");
		int age = scanner.nextInt();
		scanner.close();
		MethodInvocation.printSeniorCitizenshipStatus(name, age);
	}
}
