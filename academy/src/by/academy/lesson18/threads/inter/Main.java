package by.academy.lesson18.threads.inter;

public class Main {

	public volatile static int test = 0;

	public static synchronized void increment() {
		test++;
	}

	public static void main(String[] args) {

		System.out.println("Main thread started...");
		MyThread myThread = new MyThread();
		new Thread(myThread, "MyThread").start();

		try {
			Thread.sleep(1100);

			myThread.disable();

			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Thread has been interrupted");
		}
		System.out.println("Main thread finished...");
	}
}
