package com.java.basics;

class Vehicle {
    public int yearOfMake;
    public String brandName;

    public Vehicle(int yearOfMake, String brandName) {
        this.yearOfMake = yearOfMake;
        this.brandName = brandName;
    }

    public int drive() {
        System.out.println("This is " + brandName + " made in " + yearOfMake);
        return 0;
    }
}

class Bike extends Vehicle{

    int costOfTheBike;

    public Bike(int yearOfMake, String brandName, int costOfTheBike) {
        super(yearOfMake, brandName);
        this.costOfTheBike = costOfTheBike;
    }
}

public class Inheritence {

    public static void main(String[] args) {
        Bike unicorn = new Bike(2015, "Unicorn", 90000);

        System.out.println("unicorn -> "+ unicorn.yearOfMake);
        System.out.println("unicorn -> "+ unicorn.brandName);
        unicorn.drive();


        Bike pulsar = new Bike(2012, "Pulsar", 8000);
        System.out.println("unicorn -> "+ pulsar.yearOfMake);
        System.out.println("unicorn -> "+ pulsar.brandName);
        pulsar.drive();

    }

}
