package com.tech.javabasics.step14staticvariablesandclasses;

public class SimpleStaticExampleRunner {
	public static void main(String[] args) {
		SimpleStaticExample e1 = new SimpleStaticExample(); // s = 10, ns = 100;
		SimpleStaticExample.someStaticValue++;
		e1.someNonStaticValue++;

		System.out.println(String.format("Static = %d and Non Static = %d", SimpleStaticExample.someStaticValue,
				e1.someNonStaticValue)); // 11, 101

		SimpleStaticExample e2 = new SimpleStaticExample();
		SimpleStaticExample.someStaticValue++;
		e2.someNonStaticValue++;
		System.out.println(String.format("Static = %d and Non Static = %d", SimpleStaticExample.someStaticValue,
				e2.someNonStaticValue)); // 11

	}

}
