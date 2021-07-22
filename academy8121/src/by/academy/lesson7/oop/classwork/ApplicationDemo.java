package by.academy.lesson7.oop.classwork;

public class ApplicationDemo {

	public static void main(String[] args) {
		System.out.println("Animal here:");
		Animal animal = new Animal();
		animal.eat();
		animal.lalala();
		animal.say();
		System.out.println("------------");

		System.out.println("Cat here:");
		Animal cat = new Cat();
		cat.eat();
		cat.say();
		cat.lalala();
		System.out.println("------------");

		System.out.println("Dog here:");
		Animal dog = new Dog();
		dog.eat();
		dog.say();
		dog.lalala();
		System.out.println("------------");

		System.out.println("Bird here:");
		Animal bird = new Bird();
		bird.eat();
		bird.say();
		bird.lalala();
		System.out.println("------------");

		Animal[] animals = new Animal[4];
		animals[0] = animal;
		animals[1] = cat;
		animals[2] = dog;
		animals[3] = bird;

		for (Animal a : animals) {
			a.say();
		}

	}
}
