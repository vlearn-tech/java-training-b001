package com.tech.javabasics.step10referencetypes;

@SuppressWarnings("unused")
public class WrapperClass {

	public static void main(String[] args) {
		Integer number = 10;
		Integer anotherNumber = Integer.valueOf(20);

		System.out.println("Max range of Integer is : " + Integer.MAX_VALUE);
		System.out.println("Min range of Integer is : " + Integer.MIN_VALUE);

		String scannedValue = "12034";
		Integer scannedNumberValue = Integer.valueOf(scannedValue);

		System.out.println("Next value of the scanned number is : " + ++scannedNumberValue);
	}

}
