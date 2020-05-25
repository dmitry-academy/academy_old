package by.academy.lesson15;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ComparatorDemo {
	public static void main(String... args) {
		List<Integer> list = generateIntegerList(255, 10);
		System.out.println(list.stream().map(m -> m.toString()).collect(Collectors.joining(", ")));
		System.out.println(list.stream().sorted(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 == null || o2 == null) {
					return 0;
				}
				if (o1 < o2) {
					return 1;
				}
				if (o1 > o2) {
					return -1;
				}
				return 0;
			}
		}).map(m -> m.toString()).collect(Collectors.joining(", ")));

	}

	private static List<Integer> generateIntegerList(Integer bound, Integer size) {
		return Stream.generate(() -> new Random().nextInt(bound)).limit(size).collect(Collectors.toList());
	}
}
