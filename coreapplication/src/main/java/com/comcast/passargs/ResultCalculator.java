package com.comcast.passargs;

public class ResultCalculator {
	public Result calculateResult(Student student) {
		int total = student.getMark1()+student.getMark2()+student.getMark3();
		int avg = total/3;
		Result result = new Result();
		result.setRollNo(student.getRollNo());
		if(avg>=40) {
			result.setGrade("PASS");
		} else {
			result.setGrade("FAIL");
		}
		return result;
	}
}
