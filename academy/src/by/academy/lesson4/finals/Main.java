package by.academy.lesson4.finals;

public class Main {
	public static void main(String... args) {
		// error
		// Animal a1 = new Animal();

		Animal a = new Cat();

		a.eat();
		a.run();
		a.voice();

		System.out.println("--------");

		a = new Dog();
		a.eat();
		a.run();
		a.voice();

		System.out.println("--------");
		a = new Frog();
		a.eat();
		a.run();
		a.voice();

		Cat cat2 = new Cat();
		cat2.sum(1, 2);
	}
}
