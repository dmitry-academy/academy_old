package by.academy.lesson18.threads.deamon;

public class WhileThread extends Thread {

	public WhileThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (;;) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Infinity thread!");
		}
	}

}
