package com.tech.javabasics.step11DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class BasicDateFunctions {
	public static void main(String[] args) {
		// What is today's date
		LocalDate today = LocalDate.now();
		System.out.println("Today's date is : " + today);

		// Print today's date in a format "07-Apr-2021"
		DateTimeFormatter formatterOne = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		System.out.println("Formatted date is : " + today.format(formatterOne));

		// Set a variable to store your birthdate and print in "04/07/2021" kind of format
		LocalDate birthdate = LocalDate.of(2000, 02, 18);
		DateTimeFormatter formatterTwo = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		System.out.println("Entered date is : " + birthdate.format(formatterTwo));

		// Accept a date from user in a particular format
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your hire date into the company (dd-MMM-yyyy): ");
		String hireDateInput = scanner.next();
		scanner.close();

		System.out.println("Hire date is : " + hireDateInput);

		// Find out how many days back this entered date is
		LocalDate hireDate = LocalDate.parse(hireDateInput, formatterOne);
		System.out.println("Number of days in service : " + ChronoUnit.YEARS.between(hireDate, today));

		// Find what is 7 days from now
		System.out.println("7 days from now : " + today.plusDays(7));

		// Find which date I will complete my 25th service anniversary
		System.out.println("25th service anniversary : " + hireDate.plusYears(25));

		// What is 2 years, 3 months and 5 days from today. Print in dd-MMM-yyyy format
		System.out.println("2 years, 3 months and 5 days from today : "
				+ today.plusYears(2).plusMonths(3).plusDays(5).format(formatterOne));
	}
}
