package com.kodnest.controlconstruct;
import java.util.Scanner;
public class StudentScholarship {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your percentage");
		int percentage=scan.nextInt();
		System.out.println("Enter your annual income");
		int income=scan.nextInt();
		if(percentage>=75)
		{
			if(income<=200000)
			{
				System.out.println("Eligible for  all Scholarship");
			}
			else 
			{
				System.out.println("Not Eligible for KES Scholarship");
				System.out.println("Congrats...you are Eligible for SSP Scholarship");
			}
		}
		else
		{
			System.out.println("Sorry... your not eligible for any scholarship");
		}
	}
}


