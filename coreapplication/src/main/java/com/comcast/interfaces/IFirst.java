package com.comcast.interfaces;

public interface IFirst {
	double pi = 3.14;							// static final
	String message = "Greetings.";				// final
	void display1();							// Regular method only consider as Abstract
	default void display2() {					// default method, static method
		System.out.println("Default - Interface concreate method.");
	}
	static void display3() {
		System.out.println("Static - Interface concreate method.");
	}
}
