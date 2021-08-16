package by.academy.seaport;

import java.util.concurrent.Semaphore;

public class CarGenerator extends Thread {

	private SeaPort seaPort;
	private Semaphore semaphore;

	public CarGenerator(SeaPort seaPort, Semaphore semaphore) {
		this.seaPort = seaPort;
		this.semaphore = semaphore;
	}

	@Override
	public void run() {
		int carNumber = 0;

		while (true) {
			try {
				System.out.println("Car (" + carNumber + ") generated");
				new Car(seaPort, semaphore, carNumber++).start();
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("something wrong!");
			}
		}

	}
}
