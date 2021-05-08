package com.tech.javabasics.step07operators;

public class LogicalOperators {
	public static void main(String[] args) {
		int age = 25;
		String countryOfBirth = "INDIA";
		boolean isCurrentlyResidingInIndia = true;
		char citizenshipStatus = 'I';

		// if a person is more than 18 years of age, is an Indian by birth and is
		// residing in India right now, then he/she is eligible to vote

		if (age >= 18 && isCurrentlyResidingInIndia && (countryOfBirth.equals("INDIA") || citizenshipStatus == 'I')) {
			System.out.println("Yes, you can vote");
		} else {
			System.out.println("Sorry, you cannot vote");
		}

	}
}
