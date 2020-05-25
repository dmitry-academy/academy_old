package by.academy.lesson15.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String... args) {
		List<Integer> list = Arrays.asList(1, 2, 3);
		list.stream().forEach(System.out::println);
		System.out.println("----");
		list.stream().filter(a -> a < 2).collect(Collectors.toList()).stream().forEach(System.out::println);
	}
}
