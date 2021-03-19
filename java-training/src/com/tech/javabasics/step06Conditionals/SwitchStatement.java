package com.tech.javabasics.step06Conditionals;

public class SwitchStatement {
	public static void main(String[] args) {
		char letter = 'A';
		boolean isVowel = findIfLetterIsAVowel(letter);
		if (isVowel) {
			System.out.println("This is a vowel");
		} else {
			System.out.println("This is not a vowel");
		}
	}

	private static boolean findIfLetterIsAVowel(char letter) {

		switch (letter) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(letter);
			break;
		default:
			return false;
		}

		return true;

//		if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
//			return true;
//		}
//		return false;
	}

}
