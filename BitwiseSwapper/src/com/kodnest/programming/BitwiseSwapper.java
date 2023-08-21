package com.kodnest.programming;
import java.util.Scanner;
public class BitwiseSwapper {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first integer: ");
		int x=scan.nextInt();
		System.out.println("Enter the second integer: ");
		int y=scan.nextInt();
		swapUsingBitwise( x, y);
	}
	public static void swapUsingBitwise(int x,int y)
	{
	int z;
	z=x^y;
	y=z^y;
	x=z^y;
	System.out.println("After swapping: First= "+x+", Second= "+y);
	}
}
