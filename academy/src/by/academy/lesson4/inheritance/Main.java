package by.academy.lesson4.inheritance;

public class Main {

	public static void main(String... args) {
		Cat cat = new Cat();

		System.out.println("our list: ");

		for (String s : cat.list) {
			System.out.println(s);
		}
		System.out.println("----------");

		System.out.println(Math.sqrt(4));
	}

}
