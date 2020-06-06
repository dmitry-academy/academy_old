package by.academy.lesson18.threads;

public class CreateThreadExample {

	public static void main(String[] args) {
		RunnableImpl mThing = new RunnableImpl();

		Thread myThready1 = new Thread(mThing);
		myThready1.start();

		Thread myThready2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello from separate thread! Method 2");
			}
		});
		myThready2.start();

		System.out.println("The main thread finished...");
	}
}
