package by.academy.lesson19.producerconsumer;

class Producer implements Runnable {

	private Store store;

	public Producer(Store store) {
		this.store = store;
	}

	public void run() {
		for (int i = 1; i < 30; i++) {
			store.put();
		}
	}
}