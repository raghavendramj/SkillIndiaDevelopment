package com.learning.java.basics;

abstract class Animal {
	// One Abstract method
	abstract void eat();

	void move() {
		System.out.println("Animal can move");
	}
}

class Lion extends Animal {
	@Override
	void eat() {
		System.out.println("Lion only eats flesh!");
	}
}

class Girafee extends Animal {

	@Override
	void eat() {
		System.out.println("Giraffe eats leaves and grass!");

	}
}

public class JavaAbstractClass {

	public static void main(String[] args) {

		Animal lion = new Lion();
		lion.eat();

		Animal girrafee = new Girafee();
		girrafee.eat();
	}
}
