package by.academy.seaport;

import java.util.concurrent.Semaphore;

public class ShipGenerator extends Thread {

	private SeaPort seaPort;
	private Semaphore semaphore;

	public ShipGenerator(SeaPort seaPort, Semaphore semaphore) {
		this.seaPort = seaPort;
		this.semaphore = semaphore;
	}

	@Override
	public void run() {
		int shipNumber = 0;

		while (true) {
			try {
				System.out.println("Ship (" + shipNumber + ") generated");
				new Ship(seaPort, semaphore, shipNumber++).start();
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("something wrong!");
			}
		}
	}
}
