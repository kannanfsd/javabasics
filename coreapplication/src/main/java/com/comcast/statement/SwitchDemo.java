package com.comcast.statement;

public class SwitchDemo {
	public static void main(String[] args) {		
		int x = 6 % 4;
		switch(x) {
		case 0:
			System.out.println("x value is "+x);			
		case 1:
			System.out.println("x value is "+x);			
		default:
			System.out.println("Default block -> x value is "+x);			
		}		
	}
}
