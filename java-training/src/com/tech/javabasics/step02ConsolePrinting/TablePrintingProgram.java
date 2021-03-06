package com.tech.javabasics.step02ConsolePrinting;

public class TablePrintingProgram {
	public static void main(String[] args) {
		int printTablesTill = 15;
		int tableFor = 8;

		System.out.println("Printing the table for " + tableFor + "\n");
		for (int i = 1; i <= printTablesTill; i++) {
			System.out.println(String.format("%d * %d = %d", tableFor, i, (i * tableFor)));
		}
	}
}
