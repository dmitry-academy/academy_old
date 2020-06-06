package by.academy.lesson19.interruption;

public class JThread extends Thread {

	public JThread(String name) {
		super(name);
	}

	public void run() {
		System.out.printf("%s started... \n", Thread.currentThread().getName());
		int counter = 1; // loop counter
		while (!isInterrupted()) {
			System.out.println("Loop " + counter++);
		}
		System.out.printf("%s finished... \n", Thread.currentThread().getName());
	}
}