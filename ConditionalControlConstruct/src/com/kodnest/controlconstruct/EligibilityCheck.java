package com.kodnest.controlconstruct;

public class EligibilityCheck {
	public static void check(int age)
	{
		if(age>=18)
		{
			System.out.println("Eligible for voting...");
		}
		else
		{
			System.out.println("Not eligible for voting...");
		}
	}

}
