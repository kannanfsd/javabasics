package com.comcast.passargs;

public class StudentMain {
	public static void main(String[] args) {
		Student student = new Student();
		student.setRollNo("CS1502");
		student.setMark1(7);
		student.setMark2(7);
		student.setMark3(6);
		ResultCalculator rCalculate = new ResultCalculator();
		Result response = rCalculate.calculateResult(student);
		System.out.println(response.getRollNo()+"---->"+response.getGrade());
	}
}
