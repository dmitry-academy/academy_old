package by.academy.seaport;

import java.util.concurrent.Semaphore;

public class SeaPortRunner {

	public static void main(String... args) {
		SeaPort seaPort = new SeaPort();
		Semaphore shipSemaphore = new Semaphore(SeaPort.HARBOR_NUMBER, true);
		Semaphore carSemaphore = new Semaphore(SeaPort.HARBOR_NUMBER, true);

		CarGenerator cg = new CarGenerator(seaPort, shipSemaphore);
		ShipGenerator sg = new ShipGenerator(seaPort, shipSemaphore);
		sg.start();
		cg.start();
	}
}
