package com.comcast.abstraction;

abstract class LivingThing {
	int a, b;						// variable declaration
	void calculate() {				// concrete method
		System.out.println(a*b);
	}
	abstract void walk();			// abstract method
}
class Human extends LivingThing {
	@Override
	void walk() {
		System.out.println("Human walk with 2 Legs");
	}	
}
class Horse extends LivingThing {
	@Override
	void walk() {
		System.out.println("Horse walk with 4 Legs.");
	}	
}

public class FirstDemo {
	public static void main(String[] args) {
		Human human = new Human();
		human.walk();
		human.a = 12;
		human.b = 10;
		human.calculate();
		Horse horse = new Horse();
		horse.walk();
		
		LivingThing livingThing = new Horse();
		livingThing.walk();
	}
}

