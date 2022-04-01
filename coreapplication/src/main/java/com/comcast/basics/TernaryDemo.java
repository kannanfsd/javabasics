package com.comcast.basics;

public class TernaryDemo {
	public static void main(String[] args) {
		int a = 7;
		int b = a++;
		System.out.println("Post Increment b is "+b+" a is "+a);
		
		int c = 7;
		int d = ++c;
		System.out.println("Pre Increment d is "+d+" c is "+c);
		
		
		int p = 12;
		int q = 16;
		int big = q>p ? q : p;
		
		System.out.println("Biggest Number:: "+big);
	}
}
