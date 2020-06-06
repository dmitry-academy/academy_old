package by.academy.lesson18.threads;

public class MyThread extends Thread {

	private int innerCounter = 0;

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			innerCounter++;
			System.out.println("InnerCounter: " + innerCounter);
			MultithreadingDemo.incrementCounter();
		}
	}

}
