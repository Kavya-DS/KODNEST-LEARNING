package com.kodnest.programming;

import java.util.Scanner;

public class LogicalOperatorValidator {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	 System.out.println("is input vali(true/false):");
	 boolean isValid=scan.nextBoolean();
	 System.out.println("Does input meet a certain condition(true/false):");
	boolean meetCertainCondition=scan.nextBoolean();
	boolean result=isValidInput( isValid, meetCertainCondition);
	if(result==true)
{
	System.out.println("Input is valid");		
	
	}
else
{
	System.out.println("Input is invalid");
}
}
	public static boolean isValidInput(boolean isValid,boolean meetCertainCondition)
	{
		boolean res=isValid && meetCertainCondition;
		return res; 
	}
}
