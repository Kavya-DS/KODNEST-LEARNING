package com.kodnest.concepts;

public class Operators {
	public static void main(String[] args) {
		//Binary Operators
		//1.Arithmetic Operators
		int a=10;
		int b=20;
		System.out.println("The result of Addition is : "+(a+b));
		System.out.println("The result of Subtraction is : "+(b-a));
		System.out.println("The result of Multiplication is : "+(a*b));
		System.out.println("The result of Division is : "+(b/a));
		System.out.println("The result of Modulo is : "+(b%a));
		
		System.out.println("============================================================================");
		
		//2.Comparison Operators
		
		System.out.println("ia a greater than b? "+(a>b));
		System.out.println("ia a lesser than b? "+(a<b));
		System.out.println("ia a greater than or equal to b? "+(a>=b));
		System.out.println("ia a lesser than or equal to b? "+(a<=b));
		System.out.println("ia a equal to b? "+(a==b));
		System.out.println("ia a not equal to b? "+(a!=b));
		
		System.out.println("============================================================================");
		
		//3.Logical Operators
		
		boolean m=true;
		boolean n=false;
		System.out.println(m&&m);
		System.out.println(n&&n);
		System.out.println(m&&n);
		System.out.println(m||m);
		System.out.println(n||n);
		System.out.println(m||n);
		
		System.out.println("==============================================================================");
		
		//4.Bitwise Operators
		
		int c=5;
		int d=3;
		System.out.println("Bitwise AND : "+(c & d));
		System.out.println("Bitwise OR : "+(c | d));
		System.out.println("Bitwise XOR : "+(c ^ d));
		System.out.println("Bitwise NOT : "+(~c));
		System.out.println("Bitwise LEFT SHIFT by 2 : "+(c<<2));
		System.out.println("Bitwise RIGHT SHIFT by 2 : "+(c>>2));
		
		System.out.println("=========================================================================");
		
		
		//Unary Operators
		//Incrementation and Decrementation Operators
		//1. Post Incrementation operator
		int e=10;
		int f,g,i,j;
		
		f=e++ + e++;
		System.out.println("e :"+e);
		System.out.println("f :"+f);
		
		//2. Pre Incrementation operator
		g=++e + ++e;
		System.out.println("g :"+g);
		
		//3. post Decrementation operator
		i=e-- + e--;
		System.out.println("i :"+i);
		
		//4. pre Decrementation operator
		j=--e +--e;
		System.out.println("j :"+j);
		
	}
	

}
