package by.academy.seaport;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Harbor {
	private AtomicInteger containers = new AtomicInteger();
	private AtomicBoolean isFree = new AtomicBoolean();
	private int maximumContainers;

	public Harbor(int containersInHarbor, int maximumContainers) {
		this.containers.set(containersInHarbor);
		this.maximumContainers = maximumContainers;
		isFree.set(true);
	}

	public boolean addContainer() {
		if (containers.get() < maximumContainers) {
			return true;
		} else {
			System.out.println("WE CAN'T ADD CONTAINER. HARBOR IS FULL.");
			return false;
		}
	}

	public void getContainer() {
		containers.decrementAndGet();
	}

	public void fillContainer() {
		containers.incrementAndGet();
	}

	public boolean hasContainer() {
		return containers.get() > 0;
	}

	public int containersInHarbor() {
		return containers.get();
	}

	public boolean canTake() {
		return isFree.get();
	}

	public boolean take() {
		return isFree.compareAndSet(true, false);
	}

	public boolean release() {
		return isFree.compareAndSet(false, true);
	}
}
