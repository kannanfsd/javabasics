package com.comcast.exception;

public class SecondDemo {
	
	public void m1() {
		System.out.println("Invoke m1 Method.");
		int sum = 12/0;
		System.out.println("Result is "+sum);
	}
	public void m2() {	
		System.out.println("Invoke m2 Method.");
		m1();		
	}
	public void m3() {
		System.out.println("Invoke m3 Method.");
		try {			
			m2();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}	
	public static void main(String[] args) {
		System.out.println("Main method is Begin.");
		SecondDemo obj = new SecondDemo();
		obj.m3();
		System.out.println("End.");
	}

}
