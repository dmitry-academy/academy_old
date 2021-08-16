package by.academy.lesson13.predicate;

import java.util.function.Predicate;

public class PredicateDemo2 {
	public static void main(String[] args) {
		Predicate<String> containsA = t -> t.contains("A");
		Predicate<String> containsB = t -> t.contains("B");
		Predicate<String> containsC = t -> t.contains("C");

		System.out.println(containsA.and(containsB).or(containsC).test("ABCD"));
	}
}