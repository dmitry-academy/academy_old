package by.academy.lesson19.interruption;

public class Program {

	public static void main(String[] args) {

		System.out.println("Main thread started...");
		JThread t = new JThread("JThread");
		t.start();
		try {
			System.out.println("try block start");
			Thread.sleep(20);
//			t.interrupt();
			Thread.sleep(20);
			System.out.println("try block start");
		} catch (InterruptedException e) {
			System.out.println("Thread has been interrupted");
		}
		System.out.println("Main thread finished...");
	}
}