package by.academy.lesson14.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperationDemo {
	public static void main(String... args) {
		List<Integer> intList = generateIntegerList(255, 10);
		System.out.println("Generated list(10): ");
		System.out.println(intList);
		System.out.println();

		// findFirst
		// Возвращает первый элемент из стрима (возвращает Optional)
		// collection.stream().findFirst().orElse(«1»)
		System.out.println("Find first: ");
		System.out.println(intList.stream().findFirst().orElse(Integer.MIN_VALUE));
		System.out.println(Collections.EMPTY_LIST.stream().findFirst().orElse(0));
		System.out.println();

		// findAny
		// Возвращает любой подходящий элемент из стрима (возвращает Optional)
		// collection.stream().findAny().orElse(«1»)
		System.out.println("Find any: ");
		System.out.println(intList.stream().findAny().orElse(Integer.MIN_VALUE));
		System.out.println();

		// collect
		// Представление результатов в виде коллекций и других структур данных
		// collection.stream().filter((s) ->
		// s.contains(«1»)).collect(Collectors.toList())
		System.out.println("Collect: ");
		System.out.println(intList.stream().filter(i -> i < 100).collect(Collectors.toList()));
		System.out.println();

		// count
		// Возвращает количество элементов в стриме
		// collection.stream().filter(«a1»::equals).count()
		System.out.println("Count: ");
		System.out.println(intList.stream().filter(i -> i < 100).count());
		System.out.println();

		// anyMatch
		// Возвращает true, если условие выполняется хотя бы для одного элемента
		// collection.stream().anyMatch(«a1»::equals)
		System.out.println("anyMatch: ");
		System.out.println(intList.stream().anyMatch(i -> i < 100));
		System.out.println();

		// noneMatch
		// Возвращает true, если условие не выполняется ни для одного элемента
		// collection.stream().noneMatch(«a8»::equals)
		System.out.println("noneMatch: ");
		System.out.println(intList.stream().noneMatch(i -> i < 100));
		System.out.println();

		// allMatch
		// Возвращает true, если условие выполняется для всех элементов
		// collection.stream().allMatch((s) -> s.contains(«1»))
		System.out.println("allMatch: ");
		System.out.println(intList.stream().allMatch(i -> i < 100));
		System.out.println();

		// min
		// Возвращает минимальный элемент, в качестве условия использует компаратор
		// collection.stream().min(String::compareTo).get()
		System.out.println("min: ");
		System.out.println(intList.stream().min(Comparator.comparing(Integer::valueOf)));
		System.out.println();

		// max
		// Возвращает максимальный элемент, в качестве условия использует компаратор
		// collection.stream().max(String::compareTo).get()
		System.out.println("max: ");
		System.out.println(intList.stream().max(Comparator.comparing(Integer::valueOf)));
		System.out.println();

		// forEach
		// Применяет функцию к каждому объекту стрима, порядок при параллельном
		// выполнении не гарантируется
		// set.stream().forEach((p) -> p.append("_1"));
		System.out.println("forEach: ");
		intList.parallelStream().forEach(p -> {
			System.out.println("forEach:" + p);
		});
		System.out.println();

		// forEachOrdered
		// Применяет функцию к каждому объекту стрима, сохранение порядка элементов
		// гарантирует
		// выполнении не гарантируется
		// list.stream().forEachOrdered((p) -> p.append("_new"));
		System.out.println("forEachOrdered: ");
		intList.parallelStream().forEachOrdered(p -> {
			System.out.println("forEachOrdered:" + p);
		});
		System.out.println();

		// toArray Возвращает массив значений стрима
		// collection.stream().map(String::toUpperCase).toArray(String[]::new);
		System.out.println("toArray: ");
		System.out.println(Arrays.toString(intList.stream().map(t -> t * 10).toArray(Integer[]::new)));
		System.out.println();

		// reduce
		// Позволяет выполнять агрегатные функции на всей коллекцией и возвращать один
		// результат
		// collection.stream().reduce((s1, s2) -> s1 + s2).orElse(0)
		System.out.println("reduce: ");
		System.out.println(intList.stream().reduce((s1, s2) -> s1 + s2).orElse(0));
		System.out.println();

	}

	private static List<Integer> generateIntegerList(Integer seed, Integer size) {
		return Stream.generate(() -> new Random().nextInt(seed)).limit(size).collect(Collectors.toList());
	}

}
