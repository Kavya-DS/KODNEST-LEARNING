package com.kodnest.controlconstruct;

import java.util.Scanner;

public class EligibilityCheckApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=scan.nextInt();
		EligibilityCheck.check(age);
	}

}
