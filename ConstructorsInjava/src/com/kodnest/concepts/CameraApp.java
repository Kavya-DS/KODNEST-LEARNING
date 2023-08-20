package com.kodnest.concepts;
public class CameraApp {
	public static void main(String[] args) {
		
		Camera c1=new Camera( "Black","Sony",50000);
		System.out.println(c1.color);
		System.out.println(c1.brand);
		System.out.println(c1.cost);
		c1.capturingImage();
		c1.displayingImage();
		
	}
}
