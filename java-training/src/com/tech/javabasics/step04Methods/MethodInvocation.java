package com.tech.javabasics.step04Methods;

public class MethodInvocation {
	public static void main(String[] args) {
		System.out.println(MethodExample.getSumOfTwoNumbers(10, 20));
		System.out.println(MethodExample.findDiffernceBetweenTwoNumbers(101, 201));
		MethodExample.printProductOfTwoNumbers(15, 10);
		MethodExample.printTheName("James Bond");

		String nameOfPerson1 = "Aaaa";
		int ageOfPerson1 = 65;

		printSeniorCitizenshipStatus(nameOfPerson1, ageOfPerson1);

		String nameOfPerson2 = "Bbbb";
		int ageOfPerson2 = 55;

		printSeniorCitizenshipStatus(nameOfPerson2, ageOfPerson2);

		String nameOfPerson3 = "Ccccc";
		int ageOfPerson3 = 45;

		printSeniorCitizenshipStatus(nameOfPerson3, ageOfPerson3);
		String nameOfPerson4 = "Ddddd";
		int ageOfPerson4 = 75;

		printSeniorCitizenshipStatus(nameOfPerson4, ageOfPerson4);
	}

	public static void printSeniorCitizenshipStatus(String name, int age) {
		if (age > 60) {
			System.out.println(String.format("%s is a senior citizen", name));
		} else {
			System.out.println(String.format("%s is not a senior citizen", name));
		}
	}
}
