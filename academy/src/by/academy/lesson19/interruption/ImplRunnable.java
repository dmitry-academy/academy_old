package by.academy.lesson19.interruption;

public class ImplRunnable implements Runnable {

	public void run() {
		System.out.printf("%s started... \n", Thread.currentThread().getName());
		int counter = 1; // loop counter
		while (!Thread.currentThread().isInterrupted()) {
			System.out.println("Loop " + counter++);
		}
		System.out.printf("%s finished... \n", Thread.currentThread().getName());
	}
}
