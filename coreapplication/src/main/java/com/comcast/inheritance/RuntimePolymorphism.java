package com.comcast.inheritance;

class Animal {
	void whoAmI() {
		System.out.println("I am a generic animal.");
	}
}
class Cow extends Animal{
	@Override
	void whoAmI() {
		System.out.println("I am a Cow.");
	}
}
class Snake extends Animal {
	@Override
	void whoAmI() {
		System.out.println("I am a Snake.");
	}
}
class Dog extends Animal {
	@Override
	void whoAmI() {
		System.out.println("I am a Dog.");
	}
}
public class RuntimePolymorphism {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.whoAmI();
		animal = new Cow();
		animal.whoAmI();
		animal = new Snake();
		animal.whoAmI();
		animal = new Dog();
		animal.whoAmI();
	}
}
