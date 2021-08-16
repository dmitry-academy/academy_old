package by.academy.lesson18.threads.deamon;

public class DaemonThread extends Thread {

	public DaemonThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		// Checking whether the thread is Daemon or not
		System.out.println("Daemon started: " + getName());

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (Thread.currentThread().isDaemon()) {
			System.out.println(getName() + " is Daemon thread");
		}

		else {
			System.out.println(getName() + " is User thread");
		}

	}
}
