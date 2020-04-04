package by.academy.lesson1;

public class Cat {

	private int kolichestvoLap;
	private String name;

	public Cat() {
		this.kolichestvoLap = 4;
	}

	public Cat(int a) {
		this.kolichestvoLap = a;
	}

	public Cat(String name) {
		this.name = name;
		this.kolichestvoLap = 4;
	}

	public Cat(int a, String name) {
		this.name = name;
		this.kolichestvoLap = a; 
	}

	public void changeName(String newName) {
		System.out.println("Name changed");
		this.name = newName;
	}

	public void play() {
		System.out.println("Play with: " + name);
	}
}
