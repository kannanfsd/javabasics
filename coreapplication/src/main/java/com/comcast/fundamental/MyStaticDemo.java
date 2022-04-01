package com.comcast.fundamental;

class SDemo {
	static int x;
	int y;
	static int z;
	void display() {
		x++;
		y+=8;
		System.out.println("Non-static Block:: x value is "+x+" y value is "+y);
	}
	static void printData() {
		x+=10;
		z++;
		System.out.println("Static Block:: x value is "+x+" z value is "+z);
	}
}
public class MyStaticDemo {
	static void printData() {
		System.out.println("Default PrintData Method.");
	}
	public static void main(String[] args) {
		SDemo firstObj = new SDemo();
		firstObj.display();		
		SDemo secondObj = new SDemo();
		secondObj.display();
		SDemo thirdObj = new SDemo();
		thirdObj.display();
		firstObj.display();
		printData();
		SDemo.printData();
	}
}
