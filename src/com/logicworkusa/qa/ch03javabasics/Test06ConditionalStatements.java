package com.logicworkusa.qa.ch03javabasics;

public class Test06ConditionalStatements {
	
	public static void main(String[] args) {
		int x = -100;
		
		if (x > 0) {
			System.out.println("Positive");
		} else if (x < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("Zero");
		}
	}
	
}
