package by.academy.lesson19.join;

public class JoinDemo {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new MyRunnable(), "t1");
		Thread t2 = new Thread(new MyRunnable(), "t2");
		Thread t3 = new Thread(new MyRunnable(), "t3");
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join(10);
		t2.join();
		t3.join();

		System.out.println("All threads are dead, exiting main thread");
	}
}
