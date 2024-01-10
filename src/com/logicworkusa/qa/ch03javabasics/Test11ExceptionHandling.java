package com.logicworkusa.qa.ch03javabasics;

public class Test11ExceptionHandling {
	
	public static void main(String[] args) {
		try {
			int[] arr = new int[5];
			System.out.println(arr[6]); // Accessing an out-of-bounds index
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception: " + e);
		}
	}

}
