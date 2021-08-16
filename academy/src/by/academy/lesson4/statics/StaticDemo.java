package by.academy.lesson4.statics;

import by.academy.lesson4.finals.Animal;

public class StaticDemo {
	public static void main(String... args) {
		System.out.println(Animal.test);
		Animal a1 = new Animal();

		a1.test += 5;
		a1.numberOfLaps += 5;

		Animal a2 = new Animal();
		a2.test += 6;
		a2.numberOfLaps += 6;

		Animal a3 = new Animal();
		a3.test += 7;
		a3.numberOfLaps += 7;

		Animal a4 = new Animal();
		a4.test += 8;
		a4.numberOfLaps += 8;

		Animal a5 = new Animal();
		a5.test += 9;
		a5.numberOfLaps += 9;

		System.out.println(a1.test);
		System.out.println(a1.numberOfLaps);
		System.out.println();
		System.out.println(a2.test);
		System.out.println(a2.numberOfLaps);
		System.out.println();
		System.out.println(a3.test);
		System.out.println(a3.numberOfLaps);
		System.out.println();
		System.out.println(a4.test);
		System.out.println(a4.numberOfLaps);
		System.out.println();
		System.out.println(a5.test);
		System.out.println(a5.numberOfLaps);
	}
}
