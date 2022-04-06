package com.comcast.abstraction;

abstract class Shape {
	String color;
	public void setColor(String color) {
		this.color = color;
		System.out.println(color);
	}			
	abstract double calculateArea();	
}
class Circle extends Shape {
	double radius;	
	public Circle(double radius) {		
		this.radius = radius;
	}
	@Override
	double calculateArea() {		
		return Math.PI*radius*radius;
	}	
}
class Square extends Shape{
	double length;
	double breath;	
	public Square(double length, double breath) {
		this.length = length;
		this.breath = breath;
	}
	@Override
	double calculateArea() {		
		return length*breath;
	}	
}
public class AbstractDemo {
	public static void main(String[] args) {
		Shape shape = new Circle(12.5);
		shape.setColor("Circle is Green.");
		System.out.println("Area of Circle "+shape.calculateArea());
		
		shape = new Square(8.5, 8.5);
		shape.setColor("Square is Yellow.");
		System.out.println("Area of Square "+shape.calculateArea());
	}
}
