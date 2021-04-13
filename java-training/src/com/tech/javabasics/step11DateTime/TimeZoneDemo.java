package com.tech.javabasics.step11DateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZoneDemo {
	public static void main(String[] args) {
		ZonedDateTime currIST = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(currIST);
		System.out.println(currIST.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss z")));

		ZoneId targetZone = ZoneId.of("Australia/Adelaide");
		ZonedDateTime targetDate = currIST.withZoneSameInstant(targetZone);
		System.out.println(targetDate.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss z")));

		ZonedDateTime newTargetDate = currIST.withZoneSameLocal(targetZone);
		System.out.println(newTargetDate.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss z")));
	}
}
