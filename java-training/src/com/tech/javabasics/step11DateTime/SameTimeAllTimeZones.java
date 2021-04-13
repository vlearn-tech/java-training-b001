package com.tech.javabasics.step11DateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class SameTimeAllTimeZones {
	public static void main(String[] args) {

		ZonedDateTime currentTimeInIST = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

		for (String zoneId : ZoneId.getAvailableZoneIds()) {
			ZonedDateTime newZoneDT = currentTimeInIST.withZoneSameInstant(ZoneId.of(zoneId));
			String formattedNewDT = newZoneDT.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss z"));
			System.out.println(zoneId + " - " + formattedNewDT);
		}
	}
}
