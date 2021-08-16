package by.academy.lesson4.finals;

public class Dog extends Animal {

	@Override
	public void voice() {
		System.out.println("Woof!");
	}

	@Override
	public void run() {
		System.out.println("Run dog, run!");
	}
}
