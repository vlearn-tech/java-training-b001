package com.tech.javabasics.step12Classes;

import java.time.LocalDate;

public class StudentRunner {
	public static void main(String[] args) {

		Student[] students = new Student[3];
		students[0] = new Student(1001L, "Magna", 10, LocalDate.of(1998, 10, 10), 'F',
				new String[] { "Reading", "Singing" });
		students[1] = new Student(1002L, "Ananya", 10, LocalDate.of(1998, 9, 9), 'F',
				new String[] { "Singing", "Coding" });
		students[2] = new Student(1003L, "Annada", 10, LocalDate.of(1998, 8, 8), 'M',
				new String[] { "Sports", "Driving" });

//		studentOne.studentId = 1001L;
//		studentOne.name = "Magna";
//		studentOne.currentStandard = 10;
//		studentOne.dateOfBirth = LocalDate.of(1998, 10, 10);
//		studentOne.gender = 'F';
//		studentOne.hobbies = new String[] { "Reading", "Singing" };

//		studentTwo.studentId = 1002L;
//		studentTwo.name = "Ananya";
//		studentTwo.currentStandard = 10;
//		studentTwo.dateOfBirth = LocalDate.of(1998, 9, 9);
//		studentTwo.gender = 'F';
//		studentTwo.hobbies = new String[] { "Singing", "Coding" };
//
//		studentThree.studentId = 1003L;
//		studentThree.name = "Annada";
//		studentThree.currentStandard = 10;
//		studentThree.dateOfBirth = LocalDate.of(1998, 8, 8);
//		studentThree.gender = 'M';
//		studentThree.hobbies = new String[] { "Sports", "Driving" };

		students[0].participateInSports("Cricket");
		students[0].participateInSports("Basketball");
		students[1].showHobbies();
		students[2].showHobbies();

		// Which student has the highest Id
		Student studentWithHighestId = findStudentWithHighestId(students);
		System.out.println("Student with maxid is : " + studentWithHighestId);
	}

	private static Student findStudentWithHighestId(Student[] students) {
		Student studentWithMaxId = null;
		Long maxId = 0L;

		for (Student thisStudent : students) {
			if (thisStudent.studentId > maxId) {
				maxId = thisStudent.studentId;
				studentWithMaxId = thisStudent;
			}
		}
		return studentWithMaxId;
	}
}
