package com.learning.java.basics;

//Car <- Maruti <- Swift

class Car {
	public Car() {
		System.out.println("This is Class Car");
	}
}

class Maruti extends Car {

	public Maruti() {
		System.out.println("Vehicle Type : Car:Maruti");
	}

	public void brand() {
		System.out.println("Brand : Maruti Suzuki!");
	}

	public void speed() {
		System.out.println("Car:Maruti :- Max Speed : 90KMPH");
	}
}

class Swift extends Maruti {
	public Swift() {
		System.out.println("Vehicle Type : Car:Maruti:Swift");
	}

	// OVERRIDING
	public void speed() {
		System.out.println("Car:Maruti:Switf:-  Max Speed : 85KMPH");
	}
}

class NextNBaleno extends Swift {
	public NextNBaleno() {
		System.out.println("Vehicle Type : Car:Maruti:Swift:NextNBaleno");
	}

	// OVERRIDING
	public void speed() {
		System.out.println("Car:Maruti:Switf:NextNBaleno :-  Max Speed : 60KMPH");
	}
}

public class MulitLevelInheritence {

	public static void main(String[] args) {
		NextNBaleno baleno = new NextNBaleno();
		baleno.brand();
		baleno.speed();
	}
}
