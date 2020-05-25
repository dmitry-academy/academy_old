package by.academy.lesson14.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IteratroDemo {
	public static void main(String... args) {

		List<Integer> list = Stream.generate(() -> new Random().nextInt(100)).limit(10).collect(Collectors.toList());

		System.out.println(list);
		Iterator<Integer> iterator = list.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
