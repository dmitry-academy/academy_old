package by.academy.lesson19.producerconsumer;

public class ProducerConsumerDemo {
	
	public static void main(String[] args) {

		Store store = new Store();
		Producer producer = new Producer(store);
		Consumer consumer1 = new Consumer(store);
		Consumer consumer2 = new Consumer(store);
		Consumer consumer3 = new Consumer(store);

		new Thread(producer).start();
		new Thread(consumer1).start();
		new Thread(consumer2).start();
		new Thread(consumer3).start();
	}
}
