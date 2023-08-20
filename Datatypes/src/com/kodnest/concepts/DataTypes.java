package com.kodnest.concepts;

public class DataTypes {
	public static void main(String[] args) {
		//Primitive datatypes
		
		char ch='A';
		System.out.println("ch is: "+ch);
		
		byte age=22;
		System.out.println("Age is: "+age);
		
		short year=2023;
		System.out.println("Year is: "+year);
		
		int salary=40000;
		System.out.println("Salary is: "+salary);
		
		long population=98765432123456789l;
		System.out.println("Population is: "+population);
		
		float pi=3.14f;
		System.out.println("Pi is: "+pi);
		
		double distanceInLightYears=42.77777777777777;
		System.out.println("Distance in light years is: "+distanceInLightYears);
		
		boolean a=false;
		System.out.println(a);
		
		System.out.println("====================================================================================");
		System.out.println("TypeCasting");
		//TypeCasting
		//1.Implicit Typecasting
		int m=20;
		long n=m;
		System.out.println(m);
		System.out.println(n);
		
		//2.Explicit Typecasting
		int b=30;
		short c=(short)b;
		System.out.println(b);
		System.out.println(c);
		
		
		
		
	}

}
