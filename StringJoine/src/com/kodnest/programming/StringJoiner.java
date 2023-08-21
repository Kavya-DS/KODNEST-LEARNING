package com.kodnest.programming;

import java.util.Scanner;

public class StringJoiner {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the First Name and Last Name");
		String firstName=scan.next();
		String lastName=scan.next();
		System.out.println(joinStrings(firstName,lastName));
	}
	public static String joinStrings(String str1, String str2)
	{
		return str1+str2;
	}
}
