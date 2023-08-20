package com.kodnest.concepts;
public class CarApp {
	public static void main(String[] args) {
		Car c1=new Car("black","tata",30000);
		c1.allowToDrive();
		Car c2=new Car("white");
		c2.allowToDrive();
		Car c3=new Car(3000000);
		c3.allowToDrive();
		Car c4=new Car();
		c4.allowToDrive();
		Car c5=new Car("green","tayota");
		c5.allowToDrive();
		
	}

}
