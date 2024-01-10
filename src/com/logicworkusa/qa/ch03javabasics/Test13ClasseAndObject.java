package com.logicworkusa.qa.ch03javabasics;

public class Test13ClasseAndObject {
	
	public static class Rectangle {
		int length;
		int width;

		public int calculateArea() {
			return length * width;
		}
	}

	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		rect.length = 5;
		rect.width = 3;
		
		System.out.println("Area: " + rect.calculateArea());
	}
	
}
