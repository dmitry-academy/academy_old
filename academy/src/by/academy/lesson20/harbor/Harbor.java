package by.academy.lesson20.harbor;

import java.util.concurrent.atomic.AtomicInteger;

public class Harbor {
	private AtomicInteger containers = new AtomicInteger();
	private int maximumContainers;

	public Harbor(int containersInHarbor, int maximumContainers) {
		this.containers.set(containersInHarbor);
		this.maximumContainers = maximumContainers;
	}

	public boolean addContainer() {
		if (containers.get() < maximumContainers) {
			return true;
		} else
			return false;
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
}
