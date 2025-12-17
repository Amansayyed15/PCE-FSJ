package com.demo;

class student{
	String name;
	int roll;
	int age;
	String gender;
	
	void sleep() {
		System.out.println("Student is sleeping");
	}
	
}

public class firstClass {
	public static void main(String[] args) {
		student s1 = new student();
		s1.sleep();
	}
}
