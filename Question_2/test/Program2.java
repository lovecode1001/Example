package test;

import car.BMW2;
import car.Toyota2;

public class Program2 {

	public static void main(String[] args) {
		Toyota2 toyotaCar = new Toyota2("Toyota", 100);		
		BMW2 bmwCar = new BMW2("BMW", 200);
		toyotaCar.start();
		bmwCar.start();		
	}
}
