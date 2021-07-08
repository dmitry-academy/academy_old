package by.academy.lesson2;

public class Application {

	public static void main(String[] args) {
		Cat cat = new Cat("Barsik");
		Cat cat1 = new Cat("Bug", 3);

		cat.eat();
		cat.sleep();
		cat.walk();

		cat.printAge();
		cat.grow(1);
		cat.printAge();

		cat.grow(3);
		cat.printAge();
		cat1.printAge();

		int catAge = cat.getAge();

		System.out.println(catAge);
	}

}
