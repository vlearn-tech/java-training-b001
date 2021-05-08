package com.tech.javabasics.step11datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BasicDateTimeFunctions {
	public static void main(String[] args) {
		// What is today's date and current time
		LocalDateTime currentDateAndTime = LocalDateTime.now();
		System.out.println("Today's date and current time is : " + currentDateAndTime);

		// Print today's date in a format "07-Apr-2021"
		DateTimeFormatter formatterOne = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
		System.out.println("Formatted date and time is : " + currentDateAndTime.format(formatterOne));

		System.out.println("Current time tomorrow plus 2 hours 3 minutes and 4 seconds is "
				+ currentDateAndTime.plusHours(2).plusMinutes(3).plusSeconds(4).plusDays(1).format(formatterOne));

		int hour = currentDateAndTime.getHour();
		System.out.println(hour);
	}
}
