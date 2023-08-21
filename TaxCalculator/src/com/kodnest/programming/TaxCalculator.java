package com.kodnest.programming;

import java.util.Scanner;

public class TaxCalculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the purchase amount :");
		double purchaseAmount=scan.nextDouble();
		System.out.println("Enter the tax rate (in decimal form):");
		double taxRate=scan.nextDouble();
		double res=calculateTotalWithTax( purchaseAmount, taxRate);
		System.out.println("Total cost including tax :"+res);
		
	}
	public static double calculateTotalWithTax(double purchaseAmount,double taxRate)
	{
		return (purchaseAmount*taxRate)+purchaseAmount ;
	}

}
