package com.kodnest.assignment;

public class LabelledDoWhile2 {
	public static void main(String[] args) {
		int i=1;
		ram: do {
			System.out.print("Kodnest.. ");
		int j=1;
		raj: do {
			System.out.print("Welcome..");
			j++;
			if(j==2)
			{
			break ram;
			}
		}while(j<=5);
		System.out.println();
		i++;
	}while(i<=5);
	}
}
