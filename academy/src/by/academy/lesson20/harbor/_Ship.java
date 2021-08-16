package by.academy.lesson20.harbor;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class _Ship extends Thread {

	private int loadedContainers;
	private _Harbor harbor;
	private int workCount;
	private static final int MAX_CONTAINERS = 1000;
	private static final int MAX_LOADED_TO_SHIP = 10;
	private static final int COUNT_PORTS = 6;
	public boolean[] CONTROL_PLACES = null;

	public static Semaphore SEMAPHORE = new Semaphore(COUNT_PORTS, true);

	public _Ship(_Harbor harbor, int workCount, int containers, boolean[] CONTROL_PLACES) {
		this.harbor = harbor;
		this.workCount = workCount;
		this.loadedContainers = containers;
		this.CONTROL_PLACES = CONTROL_PLACES;
	}

	@Override
	public void run() {
		do {
			System.out.printf("Ship sailed\n");
			Random random = new Random();
			for (int i = 0; i < workCount; i++) {
				try {
					try {
						SEMAPHORE.acquire();
					} catch (NullPointerException e) {
						e.printStackTrace();
					}
					System.out.printf("\t ship checks free port\n");
					int controlNum = -1;
					synchronized (CONTROL_PLACES) {
						for (int n = 0; n < COUNT_PORTS; n++)
							if (CONTROL_PLACES[n]) {
								CONTROL_PLACES[n] = false;
								controlNum = n;
								System.out.printf("\t\tship in port.\n");
								break;
							}
					}

					if (loadedContainers == 0) {
						System.out.println();
						int count = 0;
						while (harbor.hasContainer() && count < MAX_LOADED_TO_SHIP) {
							harbor.getContainer();
							loadedContainers++;
							count++;
						}
						System.out.println(getName() + ", add , harbor: " + harbor.containersInHarbor() + ", ship: "
								+ loadedContainers);
					} else if (loadedContainers >= 1 && loadedContainers <= 10) {
						while (loadedContainers > 0 && harbor.addContainer()) {
							harbor.fillContainer();
							loadedContainers--;
						}
						System.out.println(getName() + ", get , harbor: " + harbor.containersInHarbor() + ", ship: "
								+ loadedContainers);
					}

					try {
						Thread.sleep(random.nextInt(100));
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					Thread.sleep(random.nextInt(100));

					synchronized (CONTROL_PLACES) {
						CONTROL_PLACES[controlNum] = true;
					}

					SEMAPHORE.release();
					System.out.printf("Ship performed loading/unloading operation\n");
				} catch (InterruptedException e) {
				}

			}
		} while (harbor.containersInHarbor() < MAX_CONTAINERS);
	}
}
