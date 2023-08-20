package com.kodnest.concept;

public class LabelledLoops {
	public static void main(String[] args) {
		labelledFor();
		System.out.println();
		labelledWhile();
		System.out.println();
		labelledDoWhile();
		
	}
		//Labelled for loop
		public static void labelledFor() {
		rajini: for(int i=1;i<=5;i++)
		{
		tamanna: for(int j=1;j<=5;j++)
		{
			System.out.print("* ");
			break rajini;
		}
		System.out.println();
		}
		}
		
		
		//Labelled while loop
		public static void labelledWhile()
		{
		int i=1;
		rajini:while(i<=5)
		{
		int j=1;
		tamanna:while(j<=5)
		{
			System.out.print("* ");
			j++;
			break rajini ;
		}
		System.out.println();
		i++;
		}
		}
		
		
		//Labelled do while loop
		public static void labelledDoWhile()
		{
		int i=1;
		rajini:do {
		int j=1;
		tamanna:do {
			System.out.print("* ");
			j++;
		if(j==2)
		{
			break rajini;
			}
		}while(j<=5);
		System.out.println();
		i++;
		}while(i<=5);
		}
	}


