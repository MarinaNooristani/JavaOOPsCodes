package com.syntax.class13;

public class Student {
	// 6. Create class Student that will have a method getGrade. Your method should
	// accept the score of a student and return a grade:
	char getGrade(int score) {
		if (score > 90) {
			return 'A';
		} else if (score > 80) {
			return 'B';
		} else if (score > 70) {
			return 'C';
		} else if (score > 50) {
			return 'D';
		} else {
			return 'F';
		}
	}

	public static void main(String[] args) {
		Student student1 = new Student();
		char grade = student1.getGrade(89);
		System.out.println(grade);

	}

}
