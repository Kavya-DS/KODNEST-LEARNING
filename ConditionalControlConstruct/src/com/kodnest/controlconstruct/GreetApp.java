package com.kodnest.controlconstruct;

import java.util.Scanner;

public class GreetApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks=scan.nextInt();
		greet g1=new greet();
		g1.check(marks);
	}

}
