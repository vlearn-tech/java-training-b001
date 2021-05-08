package com.tech.javabasics.step06conditionals;

import java.util.Scanner;

public class NextCareerOption {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What are you studying now? ");
		String currentEducation = scanner.nextLine();
		scanner.close();

		String nextCareerOption = getNextCareerOption(currentEducation);

		System.out.println("Your next career option is : " + nextCareerOption);
	}

	private static String getNextCareerOption(String currentEducation) {

		String nextCareerOption;
		if ("10th".equals(currentEducation)) {
			nextCareerOption = "Higher Secondary";
		} else if ("12th".equals(currentEducation)) {
			nextCareerOption = "Graduation";
		} else {
			nextCareerOption = "Post Graduation";
		}
		return nextCareerOption;
	}
}
