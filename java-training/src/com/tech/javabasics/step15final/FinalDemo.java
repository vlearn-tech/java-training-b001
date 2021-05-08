package com.tech.javabasics.step15final;

public class FinalDemo {

	final static Integer someValue = 10;

	public static void main(String[] args) {
		Integer i = 10;
		final String message = "";
		Float f = 10.4f;

		System.out.println(String.format("i = %d, message = %s, f = %f", i, message, f));

		i = 15;
		f = 14.6f;

		System.out.println(String.format("i = %d, message = %s, f = %f", i, message, f));
	}
}
