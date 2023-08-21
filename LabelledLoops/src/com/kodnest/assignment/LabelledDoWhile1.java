package com.kodnest.assignment;

public class LabelledDoWhile1 {
public static void main(String[] args) {
	int m=1;
	rajini: do {
	int n=1;
	tamanna: do {
		System.out.println("Kodnest ");
		n++;
		if(n==2)
		{
		break rajini;
		}
	}while(n<=5);
	System.out.println();
	m++;
}while(m<=5);
}
}
