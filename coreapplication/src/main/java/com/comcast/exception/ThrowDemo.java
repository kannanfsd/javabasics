package com.comcast.exception;


class Throw {
	public void method4() throws DivisionException {
		throw new DivisionException("Hello");
	}
	public void method3() {
		throw new CustomException("Hello world..");
	}
	public void method2() throws DivisionException {
		try {
			method4();
		} catch (DivisionException e) {
			throw e;
		}
	}
	public void method1() {
		method3();
	}
}

public class ThrowDemo {
	public static void main(String[] args) {
		Throw throwObj = new Throw();
		System.out.println("Invoke UnChecked one..");
		try {
			throwObj.method1();
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Invoke Checked one..");		
		try {
			throwObj.method2();
		} catch (DivisionException e) {
			e.printStackTrace();
		}
	}
}
