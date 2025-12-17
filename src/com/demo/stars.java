package com.demo;

public class stars {
	public static void first() {
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("*");
		}
	}
	
	public static void second() {
		for(int i = 0 ; i < 5 ; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void third() {
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void fourth() {
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j<5; j++) {
				if(i==0 || i==4 || j==0 || j==4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
	}
public static void main (String [] args) {
	first();
	System.out.println("______________");
	second();
	System.out.println("______________");
	third();
	System.out.println("______________");
	fourth();
}
}
