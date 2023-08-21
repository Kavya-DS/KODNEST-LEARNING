package com.kodnest.programming;

import java.util.Scanner;

public class TemperatureConverteApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the temperature in degree-F");
		double f=scan.nextDouble();
		TemperatureConverter temperatureConverter = new TemperatureConverter();

		System.out.println(temperatureConverter.convertFahrenheitToCelsius(f));
	}

}
