package by.academy.seaport;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Ship extends Thread {

	private Semaphore SEMAPHORE;
	private SeaPort seaport;
	private int shipNum;
	private int capacity;

	public Ship(SeaPort seaport, Semaphore semaphore, int shipNum) {
		this.shipNum = shipNum;
		this.seaport = seaport;
		this.SEMAPHORE = semaphore;
		this.capacity = new Random().nextInt(19) + 1;
	}

	@Override
	public void run() {
		System.out.println("Ship " + shipNum + "sailed ");
		try {

			SEMAPHORE.acquire();
			System.out.println("Ship " + shipNum + " checks free port");
			int controlNum = -1;
			for (int i = 0; i < SeaPort.HARBOR_NUMBER; i++) {
				synchronized (seaport) {
					if (seaport.harbors[i].canTake()) {
						seaport.harbors[i].take();
						controlNum = i;
						System.out.printf("\t\tship %d in port %d.\n", shipNum, i);
						break;
					}
				}
			}

			while (loading(controlNum) > 0) {
				Thread.sleep(1000);
			}

			Thread.sleep((int) (Math.random() * 10 + 1) * 1000);
			synchronized (seaport) {
				seaport.harbors[controlNum].release();
			}

			SEMAPHORE.release();
			System.out.printf("Ship %d performed loading/unloading operation\n", shipNum);
		} catch (InterruptedException e) {
		}
	}

	private int loading(int controlNum) {
		int minusContainers = 0;
		System.out.println(
				"Harbor #" + controlNum + "; capacity(" + seaport.harbors[controlNum].containersInHarbor() + ")");

		for (int i = 0; i < capacity; i++) {

			if (seaport.harbors[controlNum].addContainer()) {
				seaport.harbors[controlNum].fillContainer();
				minusContainers++;
			}

		}

		System.out.println(
				"Harbor #" + controlNum + "; capacity(" + seaport.harbors[controlNum].containersInHarbor() + ")");
		return minusContainers;
	}

}