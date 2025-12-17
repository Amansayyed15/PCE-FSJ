package com.demo;

class robotobj{
	String brand;
	String OS;
	String MicroP;
	
	robotobj(String brand, String OS, String MicroP){
		this.brand = brand;
		this.OS = OS;
		this.MicroP = MicroP;
	}
	
	void move() {
		System.out.println("Robot is moving");
	}
	void fight() {
		System.out.println("Robot is fighting");
	}
}
public class robot {
	public static void main(String [] args) {
		robotobj r1 = new robotobj("tesla", "Windows", "intel i3");
		r1.move();
		r1.fight();
		System.out.print(r1.brand);
	}
}
