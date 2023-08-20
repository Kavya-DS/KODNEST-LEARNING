package com.kodnest.concepts;

public class Methods {
	public static void main(String[] args) {
		greet();//Basic example for method
		
		add();//Method Type 1 
		int res=sub();//Method Type 2
		System.out.println(res);
		int a=5;
		int b=10;
		mul(a,b);//Method Type 3 
		int res1=div(a,b);
		System.out.println(res1);//Method Type 4 
	}
	public static void greet()
	{
		System.out.println("Welcome to Kodnest.....");
	}
	public static void add() {
		int a=5;
		int b=10;
		int c=a+b;
		System.out.println(c);
		
	}
	public static int sub() {
		int a=10;
		int b=5;
		int c=a-b;
		return c;
	}
	public static void mul(int a,int b) {

		int c=a*b;
		System.out.println(c);
	
	}
	public static int div(int a,int b) {

		int c=b/a;
	     return c;

}


}
