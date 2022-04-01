package com.comcast.fundamental;

class Overload {
	public void test() {
		System.out.println("This is Default Test() Method.");
	}
	public static void test(String name) {
		System.out.println("This is Single argument Method.");
	}
	public String test(String fName, String lName) {
		System.out.println("This is Two argument Method.");
		return fName+" "+lName;
	}
}

public class OverloadDemo {	
	public static void main(String[] args) {
		Overload overload = new Overload();
		overload.test();
		Overload.test("Trinity");
		System.out.println(overload.test("Batch Name: ", "Ohio"));
	}
}
