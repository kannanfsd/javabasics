package com.comcast.basics;

public class CastingDemo {

	public static void main(String[] args) {
		
		int sal = 500;
		long mySal = sal;	
		System.out.println("Implicit Casting--"+mySal);
		
		double pf = 12.67d;
		float myPf = (float)pf;	
		System.out.println("Explicit casting--"+myPf);
		
		long pfRate = (long)myPf;
		System.out.println("Explicit casting as long -- "+pfRate);

	}

}
