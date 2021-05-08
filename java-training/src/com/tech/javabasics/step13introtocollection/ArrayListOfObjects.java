package com.tech.javabasics.step13introtocollection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.tech.javabasics.step12classes.Student;

public class ArrayListOfObjects {
	public static void main(String[] args) {
		List<Student> studentsList = new ArrayList<>();

		studentsList.add(new Student(1001L, "Magna", 10, LocalDate.of(1998, 10, 10), 'F',
				new String[] { "Reading", "Singing" }));
		studentsList.add(
				new Student(1002L, "Ananya", 10, LocalDate.of(1998, 9, 9), 'F', new String[] { "Singing", "Coding" }));
		studentsList.add(
				new Student(1003L, "Annada", 10, LocalDate.of(1998, 8, 8), 'M', new String[] { "Sports", "Driving" }));

		studentsList.add(new Student(1004L, "Manish", 10, LocalDate.of(1998, 10, 8), 'M',
				new String[] { "Travelling", "Painting" }));

		studentsList.add(new Student(1005L, "Pragyan", 10, LocalDate.of(1998, 11, 19), 'F',
				new String[] { "Cooking", "Painting" }));

		studentsList.add(new Student(1005L, "Manoj", 10, LocalDate.of(1998, 11, 19), 'M',
				new String[] { "Cooking", "Painting" }));

		studentsList.add(new Student(1005L, "Shruti", 10, LocalDate.of(1998, 10, 12), 'F',
				new String[] { "Cooking", "Painting" }));

		studentsList.add(
				new Student(1005L, "Vikas", 10, LocalDate.of(1999, 1, 19), 'm', new String[] { "Cooking", "Coding" }));

		printAllStudentInfo(studentsList);

	}

	private static void printAllStudentInfo(List<Student> students) {
		for (Student student : students) {
			System.out.println(student);
		}
	}
}
