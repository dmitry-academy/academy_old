package by.academy.lesson5;

import by.academy.lesson2.Cat;

public class PackageDemo {

	public static void main(String[] args) {
		Cat cat1 = new Cat();

		cat1.eat();
		cat1.sleep();
		cat1.walk();

		by.academy.lesson5.classwork.Cat cat2 = new by.academy.lesson5.classwork.Cat();

		cat2.jump();

	}

}
