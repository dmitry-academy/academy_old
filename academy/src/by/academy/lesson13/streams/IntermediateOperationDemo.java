package by.academy.lesson13.streams;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperationDemo {
	public static void main(String... args) {

		List<Integer> intList = generateIntegerList(255, 100);
		// filter Отфильтровывает записи, возвращает только записи,
		// соответствующие условию collection.stream().filter(«a1»::equals).count()
		System.out.println("Generated list(100): ");
		System.out.println(intList);

		System.out.println("Filtred list: ");
		System.out.println(intList.stream().filter(i -> i < 100).collect(Collectors.toList()));

		System.out.println(intList.stream().filter(i -> i < 100).map(i -> {
			return i.toString();
		}).collect(Collectors.joining(", ")));

		System.out.println(Stream.of("test1", "test2", "test3").collect(Collectors.joining(", ")));
		System.out.println(Stream.of(1, 2, 3).map(i -> i.toString()).collect(Collectors.joining(", ")));
		System.out.println();

		// skip Позволяет пропустить N первых элементов
		// collection.stream().skip(collection.size() — 1).findFirst().orElse(«1»)
		List<Integer> skipList = generateIntegerList(10, 10);
		System.out.println("Generated list(10): ");
		System.out.println(skipList);

		System.out.println("After skip(5) operation: ");
		System.out.println(skipList.stream().skip(5).collect(Collectors.toList()));
		System.out.println();

		// distinct Возвращает стрим без дубликатов (для метода equals)
		// collection.stream().distinct().collect(Collectors.toList())

		List<Integer> distinctList = generateIntegerList(10, 10);
		System.out.println("Generated list(10): ");
		System.out.println(distinctList);

		System.out.println("After distinct operation: ");
		System.out.println(distinctList.stream().distinct().collect(Collectors.toList()));
		System.out.println();

		// map Преобразует каждый элемент стрима
		// collection.stream().map((s) -> s + "_1").collect(Collectors.toList())
		List<Integer> mapList = generateIntegerList(10, 10);
		System.out.println("Generated list(10): ");
		System.out.println(mapList);

		System.out.println("After map operation (i * 10): ");
		System.out.println(mapList.stream().map(i -> i * 10).collect(Collectors.toList()));

		// peek Возвращает тот же стрим, но применяет функцию к каждому элементу стрима
		// collection.stream().map(String::toUpperCase).peek((e) -> System.out.print(","
		// + e)).
		System.out.println("Peek example: ");
		mapList.stream().peek((qwqeqwe) -> System.out.print("(" + qwqeqwe + ")"));
		System.out.println();

		System.out.println("Limit 2: ");
		System.out.println(mapList.stream().limit(2).collect(Collectors.toList()));

		System.out.println("Sorted: ");
		System.out.println(mapList.stream().sorted().collect(Collectors.toList()));

	}

	private static List<Integer> generateIntegerList(Integer seed, Integer size) {
		return Stream.generate(() -> new Random().nextInt(seed)).limit(size).collect(Collectors.toList());
	}
}
