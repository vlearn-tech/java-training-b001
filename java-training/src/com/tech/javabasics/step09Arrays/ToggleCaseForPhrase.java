package com.tech.javabasics.step09Arrays;

public class ToggleCaseForPhrase {
	public static void main(String[] args) {
		// Take an input phrase
		String phrase = "I am learning Java!";
		char[] phraseArray = phrase.toCharArray();

		System.out.println("Original Phrase    : " + phrase);

		System.out.print("Transformed Phrase : ");

		// Loop through each letter in the phrase
		for (char ch : phraseArray) {
			// If letter is lower case, then change to upper case, else vice versa
			if (ch >= 'a' && ch <= 'z') {
				System.out.print(("" + ch).toUpperCase());
			} else {
				System.out.print(("" + ch).toLowerCase());
			}
		}
	}
}