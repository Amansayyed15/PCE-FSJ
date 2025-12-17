package com.demo;

class cars {
	String brand;
	String color;
	int seats;
	
	cars(String brand, String color, int seats){
		this.brand = brand;
		this.color = color;
		this.seats = seats;
	}
	
	void start() {
		System.out.println("Car is starting");
	}
	void drive() {
		System.out.println("car is getting drived");
	}
}
public class car {
	public static void main(String [] args) {
		cars c1 = new cars("tesla", "black", 4);
		c1.start();
		c1.drive();
		System.out.println(c1.brand);
		System.out.println(c1.color);
		System.out.println(c1.seats);
	}
}
