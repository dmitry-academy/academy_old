package by.academy.lesson18.threads.yield;

//Driver Class 
public class YieldDemo {
	public static void main(String[] args) throws InterruptedException {

		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		MyThread t4 = new MyThread();

		t1.start();
		t2.start();
		t3.start();
		t4.start();

		t1.join();
		t2.join();
		t3.join();
		t4.join();

		for (int i = 0; i < 5; i++) {
			// Control passes to child thread
			// рекомендательный характер
			Thread.yield();

			// After execution of child Thread
			// main thread takes over
			System.out.println(Thread.currentThread().getName() + " in control");
		}
	}
}
