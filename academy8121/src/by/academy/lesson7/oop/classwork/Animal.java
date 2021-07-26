package by.academy.lesson7.oop.classwork;

public class Animal extends Creature implements Walkable {

	public void eat() {
		System.out.println("Eat!");
	}

	protected void lalala() {
		System.out.println("lalala!");
	}

	public void say() {
		System.out.println("...");
	}

	protected void test() {

	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub

	}
}
