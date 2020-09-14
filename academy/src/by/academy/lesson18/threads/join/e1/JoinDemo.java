package by.academy.lesson18.threads.join.e1;

public class JoinDemo {
	public static void main(String[] args) {
		JoinRunnable a = new JoinRunnable("A");
		JoinRunnable b = new JoinRunnable("B");
		JoinRunnable c = new JoinRunnable("C");

		a.start();
		try {
			a.join();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		b.start();
		c.start();
	}
}