package by.academy.lesson7.oop;

public class ToyDemo {
	public static void main(String... args) {
		String[] arr = { "Disney" };
		Toy toy = new Toy("Кукла", 34, arr, 3);
		System.out.println(toy);
	}
}