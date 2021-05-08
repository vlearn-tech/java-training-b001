package com.tech.javabasics.step14staticvariablesandclasses;

import java.time.LocalDate;

public class StudentRunnerWithDynamicStudentId {

	public static void main(String[] args) {

		StudentsList.addNewStudent(
				new StudentWithDynamicId("Magna", 10, LocalDate.of(1998, 10, 10), 'F', new String[] { "Reading", "Singing" }));
		StudentsList.addNewStudent(
				new StudentWithDynamicId("Ananya", 10, LocalDate.of(1998, 9, 9), 'F', new String[] { "Singing", "Coding" }));
		StudentsList.addNewStudent(
				new StudentWithDynamicId("Annada", 10, LocalDate.of(1998, 8, 8), 'M', new String[] { "Sports", "Driving" }));
		StudentsList.addNewStudent(
				new StudentWithDynamicId("Manish", 10, LocalDate.of(1998, 10, 8), 'M', new String[] { "Travelling", "Painting" }));

		StudentsList.addNewStudent(
				new StudentWithDynamicId("Pragyan", 10, LocalDate.of(1998, 11, 19), 'F', new String[] { "Cooking", "Painting" }));

		StudentsList.addNewStudent(
				new StudentWithDynamicId("Manoj", 10, LocalDate.of(1998, 11, 19), 'M', new String[] { "Cooking", "Painting" }));

		StudentsList.addNewStudent(
				new StudentWithDynamicId("Shruti", 10, LocalDate.of(1998, 10, 12), 'F', new String[] { "Cooking", "Painting" }));

		StudentsList.addNewStudent(
				new StudentWithDynamicId("Vikas", 10, LocalDate.of(1999, 1, 19), 'm', new String[] { "Cooking", "Coding" }));

		StudentsList.printAllStudentInfo();

	}

}