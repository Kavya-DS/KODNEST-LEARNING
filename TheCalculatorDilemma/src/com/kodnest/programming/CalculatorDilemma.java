package com.kodnest.programming;
import java.util.Scanner;
public class CalculatorDilemma {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println("Enter number between 1-4 for Add,Sub,Mul and Div respectivily");
		int num=scan.nextInt();
		calculator(num,num1,num2);
	}
	public static void calculator(int num,int num1,int num2)
	{
		switch(num)
		{
		case 1:
			System.out.println("Addition :"+(num1+num2));
			break;
		case 2:
			System.out.println("Subtraction :"+(num1-num2));
			break;
		case 3:
			System.out.println("Multiplication :"+(num1*num2));
			break;
		case 4:
			System.out.println("Division :"+(num1/num2));
			break;
		}	
	}
}
