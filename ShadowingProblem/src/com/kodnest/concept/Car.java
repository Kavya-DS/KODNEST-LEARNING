package com.kodnest.concept;

public class Car {
	String brand;
	String color;
	int cost;
	void allowToDrive()
	{
		System.out.println("A "+brand+" "+color+" color car which is of cost "+cost+" is going");
	}
	public Car( String color,String brand, int cost)
	{
	this.color=color;
		this.brand=brand;
		this.cost=cost;
	}
}
