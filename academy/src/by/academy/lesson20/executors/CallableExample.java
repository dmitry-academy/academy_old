package by.academy.lesson20.executors;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
	public CallableExample() {

		ExecutorService executor;
		executor = Executors.newFixedThreadPool(3);

		List<Future<String>> futures;

		futures = new ArrayList<Future<String>>();

		Callable<String> callable = new CallableClass();

		for (int i = 0; i < 3; i++) {
			Future<String> future;
			future = executor.submit(callable);
			futures.add(future);
		}
		SimpleDateFormat sdf;
		sdf = new SimpleDateFormat("HH:mm:ss  ");
		for (Future<String> future : futures) {
			try {
				String text = sdf.format(new Date()) + future.get();
				System.out.println(text);
			} catch (InterruptedException | ExecutionException e) {
			}
		}
		executor.shutdown();
	}

	class CallableClass implements Callable<String> {
		@Override
		public String call() throws Exception {
			Thread.sleep(1000);
			return Thread.currentThread().getName();
		}
	}

	// -----------------------------------------------------
	public static void main(String args[]) {
		new CallableExample();
	}
}