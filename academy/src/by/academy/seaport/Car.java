package by.academy.seaport;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Car extends Thread {

	private Semaphore SEMAPHORE;
	private SeaPort seaport;
	private int сarNum;
	private int capacity;

	public Car(SeaPort seaport, Semaphore semaphore, int сarNum) {
		this.сarNum = сarNum;
		this.seaport = seaport;
		this.SEMAPHORE = semaphore;
		this.capacity = new Random().nextInt(3) + 1;
	}

	@Override
	public void run() {
		System.out.println("Car " + сarNum + "sailed ");
		try {

			SEMAPHORE.acquire();
			System.out.println("Car " + сarNum + " checks free port");
			int controlNum = -1;
			synchronized (seaport) {
				for (int i = 0; i < SeaPort.HARBOR_NUMBER; i++) {
					if (seaport.harbors[i].canTake()) {
						seaport.harbors[i].take();
						controlNum = i;
						System.out.printf("\t\tCar %d in port %d.\n", сarNum, i);
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
			System.out.printf("Car %d performed loading/unloading operation\n", сarNum);
		} catch (InterruptedException e) {
		}
	}

	private int loading(int controlNum) {
		int minusContainers = 0;
		System.out.println(
				"Harbor #" + controlNum + "; capacity(" + seaport.harbors[controlNum].containersInHarbor() + ")");

		for (int i = 0; i < capacity; i++) {

			if (seaport.harbors[controlNum].hasContainer()) {
				seaport.harbors[controlNum].getContainer();
				minusContainers++;
			}

		}

		System.out.println(
				"Harbor #" + controlNum + "; capacity(" + seaport.harbors[controlNum].containersInHarbor() + ")");
		return minusContainers;
	}

}
