package com.comcast.basics;


class Student {
	int regId;
	void displayRegId() {
		System.out.println("The Student Registation Id is "+regId);
	}
}

public class StudentMain {
	public static void main(String[] args) {
		Student student = null;
		student = new Student();
		student.regId = 1290;
		student.displayRegId();
	}

}
