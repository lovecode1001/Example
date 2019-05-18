package main;

public abstract class CarBase {
	int wheels = 4;
	int doors = 4;
	int seats = 5;
	int maxSpeed;

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(maxSpeed);
		}
	}

	public void info() {
		System.out.println("Car Informations as below:");
		System.out.println(wheels);
		System.out.println(doors);
		System.out.println(seats);
		System.out.println(maxSpeed);
	}
}
