package by.academy.lesson18.threads.deamon;

public class DeamonDemo {
	public static void main(String[] args) {

		DaemonThread t1 = new DaemonThread("t1");
		DaemonThread t2 = new DaemonThread("t2");
		DaemonThread t3 = new DaemonThread("t3");

//		WhileThread whileThread = new WhileThread("t4");
//		whileThread.setDaemon(true);
//		whileThread.start();
		// Setting user thread t1 to Daemon

		// starting first 2 threads
		t1.start();
		t2.start();

		// Setting user thread t3 to Daemon
		t3.start();
		
		System.out.println("END!");
	}
}
