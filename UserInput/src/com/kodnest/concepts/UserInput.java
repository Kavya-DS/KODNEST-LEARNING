package com.kodnest.concepts;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter student first name");
		String a=scan.next();
		System.out.println("the value of a is  " +a);		
		System.out.println("enter student last name");
		String b=scan.next();
		System.out.println("the value of b is  " +b);
		System.out.println("enter student age");
		int c=scan.nextInt();
		System.out.println("the value of c is  " +c);
		System.out.println("enter student gender");
		String d=scan.next();
		System.out.println("the value of d is  " +d);	
		System.out.println("enter student married? say true or false");
		boolean e=scan.nextBoolean();
		System.out.println("the value of e is  " +e);
		
		System.out.println("enter student branch");
		scan.nextLine();
		String f=scan.nextLine();
		System.out.println("the value of f is  " +f);	
		System.out.println("enter student height");
		float g=scan.nextFloat();
		System.out.println("the value of g is  " +g);
		System.out.println("enter student weight");
		int h=scan.nextInt();
		System.out.println("the value of h is  " +h);
	}

}
