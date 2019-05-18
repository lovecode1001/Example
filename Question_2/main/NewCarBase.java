package main;

public class NewCarBase implements Runnable {
	int wheels = 4;
	int doors = 4;
	int seats = 5;
	int maxSpeed;
	String carName;
	Thread thread;

	public NewCarBase(String carName, int maxSpeed) {
		this.carName = carName;
		this.maxSpeed = maxSpeed;
		thread = new Thread(this, carName);
	}

	public void start() {
		thread.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(maxSpeed);
		}
	}
}