package by.academy.lesson4.inheritance;

import by.academy.lesson4.finals.Animal;

public class Cat extends Animal {

	@Override
	public void test() {
		System.out.println();
	}

	@Override
	public void voice() {
		System.out.println("Meow");
	}

	public void voice(String name) {
		System.out.println("Meow " + name);
	}

	public void voice(String name, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("Meow " + name);
		}
	}

	public void voice(int n, String name) {
		for (int i = 0; i < n; i++) {
			System.out.println("Meow " + name);
		}
	}

	public void voice(String[] i, String[] strings) {
	}
}
