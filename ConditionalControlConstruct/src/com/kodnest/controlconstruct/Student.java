package com.kodnest.controlconstruct;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your POY");
		int year=scan.nextInt();
		System.out.println("Enter your CGPA");
		float cgpa=scan.nextFloat();
		if(year>=2021)
		{
			if(cgpa>=7) {
				System.out.println("Eligible to apply for this drive");
			}
		}
	}

}
