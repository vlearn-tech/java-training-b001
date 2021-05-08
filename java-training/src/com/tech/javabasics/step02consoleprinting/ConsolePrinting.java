package com.tech.javabasics.step02consoleprinting;

public class ConsolePrinting {

	public static void main(String[] args) {
		System.out.println("I am learning Java");
		System.out.print("I am finding it difficult at start");
		System.out.println("..but as I learn more, it will start getting easy.");

		System.out.println("\n\n===============================\n\n");

		// Initialize some variables
		String name = "ABC";
		int age = 25;

		System.out.println("Name is " + name);
		System.out.printf("Name is %s", name).println();
		System.out.println(String.format("Name is %s", name));
		System.out.println(String.format("Name is %s", name));

//		3 different ways to print: Name is ABC and age is 25
		System.out.println("Name is " + name + " and age is " + age);
		System.out.format("Name is %s and age is %d", name, age);
		System.out.println(String.format("Name is %s and age is %d", name, age));

		System.out.println(String.format("%d", 1));

		System.out.println("The line before");
		System.out.println("\n");
		System.out.println("The line after");

	}
}
