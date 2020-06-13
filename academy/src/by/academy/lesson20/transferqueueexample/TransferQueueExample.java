package by.academy.lesson20.transferqueueexample;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

public class TransferQueueExample {
	
	TransferQueue<String> queue = null;

	String WAIT_producer = "Producer waiting to transfer : ";
	String TRANSFERED = "Producer transfered :";

	String WAIT_consumer = "Consumer waiting to consumed : ";
	String CONSUMED = "Consumer consumed : ";

	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

	public TransferQueueExample() {
		queue = new LinkedTransferQueue<String>();

		new Thread(new Producer()).start();
		new Thread(new Consumer()).start();
	}

	void printMessage(final String msg) {
		String text = sdf.format(new Date()) + " " + msg;
		System.out.println(text);
	}

	class Producer implements Runnable {
		@Override
		public void run() {
			for (int i = 0; i < 2; i++) {
				try {
					printMessage(WAIT_producer + i);
					queue.transfer("'producer-" + i + "'");
					printMessage(TRANSFERED + i + "\n");
				} catch (Exception e) {
				}
			}
		}

	}

	class Consumer implements Runnable {
		@Override
		public void run() {
			for (int i = 0; i < 2; i++) {
				try {
					Thread.sleep(2000);
					printMessage(WAIT_consumer + i);
					String element = queue.take();
					printMessage(CONSUMED + element);
				} catch (Exception e) {
				}
			}
		}
	}

	public static void main(String args[]) {
		new TransferQueueExample();
	}
}