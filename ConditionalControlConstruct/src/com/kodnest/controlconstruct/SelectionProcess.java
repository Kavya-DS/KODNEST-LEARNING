package com.kodnest.controlconstruct;

import java.util.Scanner;

public class SelectionProcess {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your score");
		int score=scan.nextInt();
		if(score>=90)
		{
			System.out.println("Your CTC is 6LPA");
		}
		else
		{
			if(score>=70 &&score<90)
			{
				System.out.println("Your CTC is 3LPA");
			}
			else
			{
				System.out.println("Not Selected");
			}
		}
	}
}
