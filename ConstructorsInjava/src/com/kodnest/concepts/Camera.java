package com.kodnest.concepts;

public class Camera {
	String color;
	String brand;
	int cost;
	void capturingImage()
	{
		System.out.println("image captured....");
	}
	
	void displayingImage()
	{
		System.out.println("image displayed....");
	}
	public Camera(String x,String y,int z)
	{
		color=x;
		brand=y;
		cost=z;

}
}
