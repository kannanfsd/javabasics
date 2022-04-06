package com.comcast.inheritance;

class Base {
	public void printMessage() {
		System.out.println("Super class - printMessage() Method.");
	}
}
class Derived extends Base {
	@Override
	public void printMessage() {
		super.printMessage();
		System.out.println("Derived class - printMessage() Method.");
	}
}

public class SuperKeyDemo {
	public static void main(String[] args) {
		Derived derived = new Derived();
		derived.printMessage();
	}
}
