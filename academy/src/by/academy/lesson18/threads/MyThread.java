package by.academy.lesson18.threads;

public class MyThread extends Thread {

	private int innerCounter = 0;
	private String test;

	public MyThread(String test) {
		super();
		this.test = test;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			innerCounter++;
			System.out.println("InnerCounter: " + innerCounter + test);
			MultithreadingDemo.incrementCounter();
		}
	}

}
