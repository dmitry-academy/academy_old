package by.academy.lesson10;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;


public class QDemo {
	public static void main(String... args) {
		Queue<Integer> q = new ArrayBlockingQueue<>(32);	
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		System.out.println(q.poll());
	}
}
