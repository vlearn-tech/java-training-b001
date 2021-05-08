package com.tech.javabasics.step14staticvariablesandclasses;

import java.util.ArrayList;
import java.util.List;

public class StudentsList {
	public static List<StudentWithDynamicId> studentsList = new ArrayList<>();

	public static void printAllStudentInfo() {
		for (StudentWithDynamicId student : studentsList) {
			System.out.println(student);
		}
	}

	public static void addNewStudent(StudentWithDynamicId studentToAdd) {
		studentsList.add(studentToAdd);
	}
}
