package com.tech.javabasics.step12classes;

import java.time.LocalDate;
import java.util.Arrays;

public class Student {
	// attributes (nouns)
	Long studentId;
	String name;
	Character gender;
	LocalDate dateOfBirth;
	Integer currentStandard;
	String[] hobbies;

	// activities (verbs)
	public void participateInSports(String sport) {
		System.out.println(String.format("%s is going to participate in %s", this.name, sport));
	}

	public void showHobbies() {
		System.out.println(String.format("Hobbies of %s is/are %s", this.name, Arrays.toString(this.hobbies)));
	}

//	takeExam();
//
//	askADoubt();
//
//	createANewHobby();

	// Private method. Cannot be accessed from other files/classes
	private void showMyBestFriendName(String bestFriend) {
		System.out.println(String.format("Best friend of %s is %s", name, bestFriend));
	}

	public Student(Long studentId, String name, Integer currentStandard, LocalDate dateOfBirth, Character gender,
			String[] hobbies) {
		this.studentId = studentId;
		this.name = name;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.currentStandard = currentStandard;
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", gender=" + gender + ", dateOfBirth="
				+ dateOfBirth + ", currentStandard=" + currentStandard + ", hobbies=" + Arrays.toString(hobbies) + "]";
	}

	public Student() {
	}

	// Create Constructor with arguments
//	public Student(Long studentId, String name, Integer currentStandard, LocalDate dateOfBirth, Character gender,
//			String[] hobbies) {
//		this.studentId = studentId;
//		this.name = name;
//		this.currentStandard = currentStandard;
//		this.dateOfBirth = dateOfBirth;
//		this.gender = gender;
//		this.hobbies = hobbies;
//	}

}
