package by.academy.lesson8.generics.box;

import by.academy.lesson2.animal.Dog;
import by.academy.lesson5.deals.Product;

public class Main {

	public static void main(String[] args) {
		Box<Product> box = new Box<Product>();
		box.addItem(new Product("Колбаса", 1000, 10));

		Box<Dog> dogs = new Box<Dog>();
		Dog dog = dogs.getItem(1);
	}

}
