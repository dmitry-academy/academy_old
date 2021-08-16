package by.academy.lesson20.synchqueuesexample;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SynchQueuesExample {
	private BlockingQueue<String> drop;

	private final String DONE = "done";
	private final String[] messages = { "���� ����� �������� ����", "���� ������� � �����", "���� ������ �������� ����",
			"� ��� ��� ����?" };

	public static void main(String[] args) {
		new SynchQueuesExample();
	}

	private final String BEFORE_PUT = "*** %s before put message";
	private final String AFTER_PUT = "*** %s after put message\n";

	private final String BEFORE_TAKE = "--- %s before take message";
	private final String AFTER_TAKE = "--- %s after take message\n";

	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

	public SynchQueuesExample() {
		drop = new SynchronousQueue<String>();
		(new Thread(new Producer())).start();
		(new Thread(new Consumer())).start();
	}

	void printMessage(final String templ) {
		String text = String.format(templ, sdf.format(new Date()));
		System.out.println(text);
	}

	class Producer implements Runnable {
		public void run() {
			try {
				for (int i = 0; i < messages.length; i++) {
					printMessage(BEFORE_PUT);
					drop.put(messages[i]);
					printMessage(AFTER_PUT);
				}
				drop.put(DONE);
			} catch (InterruptedException e) {
			}
		}
	}

	class Consumer implements Runnable {
		public void run() {
			try {
				String msg = null;
				while (true) {
					printMessage(BEFORE_TAKE);
					Thread.sleep(3000);
					if (!((msg = drop.take()).equals(DONE))) {
						System.out.println(msg);
					} else
						break;
					printMessage(AFTER_TAKE);
				}
			} catch (InterruptedException e) {
			}
		}
	}
}
