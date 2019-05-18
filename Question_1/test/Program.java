package test;

import car.BMW;
import car.Toyota;

public class Program {

	public static void main(String[] args) {
		Toyota toyotaCar = new Toyota();
		toyotaCar.setMaxSpeed(100);
		
		BMW bmwCar = new BMW();
		bmwCar.setMaxSpeed(200);
		
		toyotaCar.run();
		bmwCar.run();
	}
}
