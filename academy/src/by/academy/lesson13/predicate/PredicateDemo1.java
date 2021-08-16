package by.academy.lesson13.predicate;

import java.util.function.Predicate;

public class PredicateDemo1 {
	public static void main(String[] args) {

		Predicate<Integer> negative = i -> i < 0;

		System.out.println(negative.test(-6));
		System.out.println(negative.test(6));
		System.out.println(negative.test(0));
	}

	public static boolean test(Integer i) {
		return i < 0;
	}
}