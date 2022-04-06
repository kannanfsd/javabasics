package com.comcast.inheritance;


class A {
//	A() {
//		System.out.println("A - Default Constructor.");
//	}
	A(String location){
		System.out.println("Location is "+location);
	}
}
class B extends A{
//	B() {
//		super("Chennai");
//		System.out.println("B - Default Constructor.");
//	}
	B(String name) {	
		super("Chennai");
		System.out.println("Name is "+name);
	}
}


public class SuperMethodDemo {
	public static void main(String[] args) {
		B b = new B("Raju");
	}
}
