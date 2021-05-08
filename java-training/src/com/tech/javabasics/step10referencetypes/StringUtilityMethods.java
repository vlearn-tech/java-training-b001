package com.tech.javabasics.step10referencetypes;

import java.util.Arrays;

public class StringUtilityMethods {
	public static void main(String[] args) {
		String message = "Hello World";
		System.out.println(message);

		char[] msgArray = message.toCharArray();
		System.out.println(Arrays.toString(msgArray));

		System.out.println("First character : " + message.charAt(0));
		System.out.println("Third character : " + message.charAt(2));
		System.out.println("Length of the message : " + message.length());
		System.out.println("Index of the letter o : " + message.indexOf('o'));
		System.out.println("Last Index of the letter o : " + message.lastIndexOf('o'));
		System.out.println("Index of the literal 'lo' : " + message.indexOf("lo"));
		System.out.println("Is 'lo' present in the message : " + message.contains("lo"));
		System.out.println("If message starts with 'Hello': " + message.startsWith("Hello"));
		System.out.println("If message starts with 'Wo': " + message.startsWith("Wo"));
		System.out.println("If message ends with 'ld': " + message.endsWith("ld"));

		System.out.println("hello compared to Hello : " + "hello".compareTo("Hello"));
		System.out.println("Is hello = Hello ? " + "hello".equals("Hello"));
		System.out.println("Is hello = Hello after ignoring case ? " + "hello".equalsIgnoreCase("Hello"));

		String[] names = { "Prakash", "Magna", "Ananya", "Annada", "Suman" };
		System.out.println(Arrays.toString(names));
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));

		System.out.println("Message in CAPS : " + message.toUpperCase());
		System.out.println("Message in lower case : " + message.toLowerCase());

		String newMessage = "     This is looking bad!!    ";
		System.out.println(newMessage.trim());
		System.out.println(newMessage.replace("bad", "good").trim());

		String combinedMsg = message + ". " + newMessage.replace("bad", "good").trim();

		System.out.println(combinedMsg.substring(13));
		System.out.println(combinedMsg.substring(13, 17));
		System.out.println(combinedMsg.charAt(13) + "  " + combinedMsg.charAt(16));

	}
}
