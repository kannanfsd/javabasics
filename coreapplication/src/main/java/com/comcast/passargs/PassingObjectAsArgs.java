package com.comcast.passargs;


class Test {
	int a, b;

	public Test(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void alternatePrimitive(int x, int y) {
		this.a = x;
		this.b = y;
	}
	
	public void alternateObject(Test obj) {
		obj.a = 65;
		obj.b = 72;
	}
}
public class PassingObjectAsArgs {
	public static void main(String[] args) {
		Test test1 = new Test(100, 200);
		System.out.println("Initial Object state "+test1.a+", "+test1.b);
		
		test1.alternatePrimitive(250, 300);
		System.out.println("After alterPrimitive Object state "+test1.a+", "+test1.b);
		
		test1.alternateObject(test1);
		System.out.println("After alterObject Object state "+test1.a+", "+test1.b);
		
	}
}
