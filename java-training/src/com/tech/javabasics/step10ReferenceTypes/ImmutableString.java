package com.tech.javabasics.step10ReferenceTypes;

public class ImmutableString {
	public static void main(String[] args) {
		String message1 = "Hello";
		String message2 = "How are you";
		String message3 = "Good evening";
		String message4 = "Hi";

		System.out.println("Before change");
		System.out.println("message1 : " + System.identityHashCode(message1));
		System.out.println("message2 : " + System.identityHashCode(message2));
		System.out.println("message3 : " + System.identityHashCode(message3));
		System.out.println("message4 : " + System.identityHashCode(message4));

		message1 = "Hi";

		System.out.println("\n\nAfter change");
		System.out.println("message1 : " + System.identityHashCode(message1));
		System.out.println("message2 : " + System.identityHashCode(message2));
		System.out.println("message3 : " + System.identityHashCode(message3));
		System.out.println("message4 : " + System.identityHashCode(message4));

		String message = "I love to write programs";

		System.out.println("\nmessage : " + System.identityHashCode(message));

		message = message.concat(" in Java");

		System.out.println(message);
		System.out.println(System.identityHashCode(message));

		String newMessage = "     This is looking bad!!    ";
		newMessage = newMessage.trim();
		System.out.println(newMessage);
	}
}
