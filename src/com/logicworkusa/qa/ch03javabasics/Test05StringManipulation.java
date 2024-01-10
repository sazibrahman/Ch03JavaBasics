package com.logicworkusa.qa.ch03javabasics;

public class Test05StringManipulation {
	
	public static void main(String[] args) {
		String str = "Java Programming";
		
		System.out.println("Length: " + str.length());
		System.out.println("Substring: " + str.substring(5));
		System.out.println("Index of 'P': " + str.indexOf('P'));
	}
	
}
