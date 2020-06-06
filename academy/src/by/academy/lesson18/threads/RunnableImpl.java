package by.academy.lesson18.threads;

class RunnableImpl implements Runnable {

	// This method will be run in separate thread
	@Override
	public void run() {
		System.out.println("Hello from separate thread! Method 1");
	}
}
