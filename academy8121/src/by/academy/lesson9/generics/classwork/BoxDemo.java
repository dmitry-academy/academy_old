package by.academy.lesson9.generics.classwork;

import by.academy.lesson5.classwork.Cat;

public class BoxDemo {
	public static void main(String... args) {

		Box<Cat> cats = new Box<>();
		cats.addItem(new Cat());
	}
}
