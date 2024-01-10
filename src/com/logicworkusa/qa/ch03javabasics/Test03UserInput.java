package com.logicworkusa.qa.ch03javabasics;

import java.util.Scanner;

public class Test03UserInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		System.out.println("Hello, " + name + "!");
	}

}
