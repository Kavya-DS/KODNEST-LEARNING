package com.kodnest.programming;

import java.util.Scanner;

public class TemperatureConversionApp {
	public static void main(String[] args) {
		System.out.println("Welcome to the Temperature Conversion Tool!");
		Scanner scan=new Scanner(System.in);
		System.out.println("Select an option:\r\n"
				+ "\r\n"
				+ "1.Convert Celsius to Fahrenheit \r\n"
				+ "\r\n"
				+ "2.Convert Fahrenheit to Celsius  \r\n"
				+ "\r\n"
				+ "Enter your choice:");
		int choice=scan.nextInt();
		if(choice==1)
		{
			System.out.println("Enter the temperature in celsius:");
			double cel=scan.nextDouble();
			double res=TemperatureConversion.celsiusToFahrenheit(cel);
			System.out.println(cel+"C is equivalent to "+res+"F");
			
		}
		else if(choice==2)
		{
			
			
			
			System.out.println("Enter the temperature in fahrenheit:");
			double fahr=scan.nextDouble();
			double res=TemperatureConversion.fahrenheitToCelsius(fahr);
	System.out.println(fahr+"F is equivalent to "+res+"C");
	}
		else
		{
			System.out.println("Please... Enter valid choice");
		}
	}
}
