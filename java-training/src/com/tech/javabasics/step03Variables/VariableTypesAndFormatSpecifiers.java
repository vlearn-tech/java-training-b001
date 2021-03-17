package com.tech.javabasics.step03Variables;

public class VariableTypesAndFormatSpecifiers {
	public static void main(String[] args) {
		int age = 35;
		boolean isSeniorCitizen = false;

		float height = 5.9f;
		String favoriteMovie = "Lord of the Rings";

		char gender = 'M';
		long aadharCardNumber = 1_234_567_898_76l;

		System.out.println(String.format("Age is %d", age));
		System.out.println(String.format("Is the person a senior Citizen? Answer is %b", isSeniorCitizen));
		System.out.println(String.format("Height is %f", height));
		System.out.println(String.format("Favorite Movie is \"%s\"", favoriteMovie));
		System.out.println(String.format("Gender is %c", gender));
		System.out.println(String.format("Aadhar Card Number is %d", aadharCardNumber));

		// Four groups of data types

		// boolean -> true/false
		// char -> single character
		// numeric -> byte, short, {int}, long
		// decimal -> float, {double}

		// Be Careful! Bears shouldn't infuriate large flying dragons

		String nameOfSubject = "Oracle";
		int howLongHaveYouBeenLearning = 1;

		System.out.println(
				String.format("I am learning %s since %d month(s)", nameOfSubject, howLongHaveYouBeenLearning));

		String message = "I am learning " + nameOfSubject + " since last " + howLongHaveYouBeenLearning + " month(s)";

		System.out
				.println("I am learning " + nameOfSubject + " since last " + howLongHaveYouBeenLearning + " month(s)");

		System.out.println(message);

	}
}
