package com.kodnest.controlconstruct;

import java.util.Scanner;

public class DayApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number between 1-7 ");
		int num=scan.nextInt();
		Day.displayDay(num);
	}
}
