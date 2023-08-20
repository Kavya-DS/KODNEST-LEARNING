package com.kodnest.concept;

public class LoopingControlConstructs {
	public static void main(String[] args) {
		//for loop
		for(int i=1;i<=5;i++)
		{
			System.out.println("Welcome");
		}
		System.out.println("============================================================================");
		
		//while loop
		int j=1;
		while(j<=5)
		{
			System.out.println("Kodnest");
			j++;
		}
		
		System.out.println("============================================================================");
		
		//do while loop
		int k=1;
		do {
			System.out.println("Technologies...");
			k++;
		}while(k<=5);
		
		System.out.println("============================================================================");
		
		//Nested for loop
		for(j=1;j<=5;j++)
		{
		for(int i=1;i<=5;i++) 
		{
			System.out.print("* ");
		}
		System.out.println();
		}
		System.out.println("============================================================================");
	
		//Nested while loop
		int m=1;
	while(m<=5)
	{
		int n=1;
	while(n<=5)
	{
		System.out.print("Kodnest ");
		n++;
	}
	System.out.println();
	m++;
	}
	System.out.println("================================================================");
	
	//Nested do while loop
	int x=1;
	do {
	int y=1;
	do {
		System.out.print("Welcome ");
		y++;
	}while(y<=5);
	System.out.println();
	x++;
	}while(x<=5);
	}
}
