package by.academy.lesson20.concurrentdinkeddequeexample;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDequeExample {
	private ConcurrentLinkedDeque<String> queue;

	public ConcurrentLinkedDequeExample() {
		queue = new ConcurrentLinkedDeque<String>();

		Thread producer = new Thread(new Producer());
		producer.start();

		Thread consumer = new Thread(new Consumer());
		consumer.start();

		while (consumer.isAlive()) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		System.exit(0);
	}

	class Producer implements Runnable {
		@Override
		public void run() {
			System.out.println("Producer started");
			String name = "producer ";
			String ins = "";
			for (int i = 0; i < 10; i++) {
				String element = "'" + name + i + "'";
				if (queue.size() % 2 == 1) {
					queue.addFirst(element);
					ins = "addFirst (" + element + ")";
				} else {
					queue.addLast(element);
					ins = "addLast (" + element + ")";
				}
				System.out.println(name + ins + ": queue.size()=" + queue.size());
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
				}
			}
		}
	}

	class Consumer implements Runnable {
		@Override
		public void run() {
			System.out.println("Consumer started");
			for (int i = 0; i < 10; i++) {
				String text = "\n   consumer : queue.size()=" + queue.size();
				String element;
				if (queue.size() % 2 == 1)
					element = "pollFirst : " + queue.pollFirst();
				else
					element = "pollLast : " + queue.pollLast();
				text += ", " + element;
				System.out.println(text);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
		}
	}

	public static void main(String[] args) {
		new ConcurrentLinkedDequeExample();
	}
}