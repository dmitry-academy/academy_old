package by.academy.lesson18.threads;

public class MyRunnableImpl implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("innter counter: " + i);
			MultithreadingDemo.incrementCounter();
		}
	}

}