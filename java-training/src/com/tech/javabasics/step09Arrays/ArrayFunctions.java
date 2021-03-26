package com.tech.javabasics.step09Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayFunctions {
	public static void main(String[] args) {
		Integer[] numbers = { 1, 4, 6, 3, 6, 8, 3, 9, 4, 7, 19, 43, 12 };

		// Print the entire array in one single line
		System.out.println(Arrays.toString(numbers));

		// Sort the array
		Arrays.sort(numbers);
		System.out.println("Sorted Array : " + Arrays.toString(numbers));

		// Determine if the array contains a particular value
		System.out.println("Does array contain 19 ? " + (Arrays.binarySearch(numbers, 19) > 0 ? true : false));

		// Sort the array in reverse order
		Arrays.sort(numbers, Comparator.reverseOrder());
		System.out.println("Sorted Array in reverse order: " + Arrays.toString(numbers));

	}
}
