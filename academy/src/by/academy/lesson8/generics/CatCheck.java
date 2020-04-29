package by.academy.lesson8.generics;

import by.academy.lesson4.finals.Animal;
import by.academy.lesson4.inheritance.Cat;
import by.academy.lesson4.inheritance.Cheetah;

public class CatCheck {

	public static void main(String... args) {
		isIn(new Cheetah());
		isIn(new Cat());
		isIn(new Animal());
		
		test(new Cheetah());
		test(new Cat());
		test(new Animal());
		
	}
	public static <T super Cat> boolean test(T x) {

		return true;
	}
	public static <T extends Cat> boolean isIn(T x) {

		return true;
	}
}
