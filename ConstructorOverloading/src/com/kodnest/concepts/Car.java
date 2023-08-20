package com.kodnest.concepts;

public class Car {
	String brand;
	String color;
	int cost;
	void allowToDrive()
	{
		System.out.println("A "+brand+" "+color+" color car which is of cost "+cost+" is going");
	}
	public Car( String x,String y, int z)
	{
	color=x;
    brand=y;
	cost=z;
	}
	public Car( String x)
	{
		color=x;
		cost=50000;
	}
	public Car(int z)
	{
		cost=z;
	}
	public Car()
	{
		color="black";
		brand="BMW";
		cost=1000000;
	}
	public Car( String x,String y)
	{
		color=x;
		brand=y;

	}


}
