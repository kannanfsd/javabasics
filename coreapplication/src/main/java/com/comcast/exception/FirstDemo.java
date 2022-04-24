package com.comcast.exception;

public class FirstDemo {
	public static void main(String[] args) {
		int c = 0;
		System.out.println("Begin the Program.");		
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[4]);
			c = a/b;	
			//System.out.println("Result is "+c);
		} catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			//System.err.println("Exception Occured, "+e.getMessage());
		} finally {
			System.out.println("Result is "+c);
		}
		System.out.println("End the program.");
	}
}
