package com.kodnest.concepts;

public class MethodOverloading {
	public static void main(String[] args) {
		teaBill();
		teaBill(10);
		teaBill(10,"ginger");
	    teaBill("lemon",8);
	}
	
	public static void teaBill() 
	{
		System.out.println("the bill value is 10");
	}
	
	
	public static void teaBill(int n) 
	{
		System.out.println("the bill value of 10 tea is: "+(10*n));
	}
	
	
	public static void teaBill(int n,String g)
	{
		int t=n*15;
		System.out.println("the total bill of "+n+" "+g+" tea is: "+t);
	}
	
	
	public static void teaBill(String g,int n) 
	{
		int t=n*50;
		System.out.println("the total bill of "+n+" "+g+" tea is: " +t);
	}
}
