package com.tech.javabasics.step11DateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DifferenceBetweenDates {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate someOtherDay = LocalDate.of(2019, 11, 14);

		Period p = Period.between(someOtherDay, today);
		System.out.println(String.format("Difference is %d Year(s), %d Month(s) and %d Day(s)", p.getYears(),
				p.getMonths(), p.getDays()));

		System.out.println("Difference is days is " + ChronoUnit.DAYS.between(someOtherDay, today));

		LocalDateTime currTime = LocalDateTime.now();
		LocalDateTime someOtherTime = currTime.plusMinutes(56).plusHours(1).plusMonths(2).plusDays(3);

		System.out.println("Difference is minutes is " + ChronoUnit.MINUTES.between(currTime, someOtherTime));

		Duration d = Duration.between(currTime, someOtherTime);
		System.out.println(String.format("Difference is %d Hours(s), %d Minutes(s) and %d Seconds(s)", d.toHours(),
				d.toMinutes(), d.toSeconds()));

	}
}
