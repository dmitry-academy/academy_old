package by.academy.lesson4.finals;

public class Animal {

	protected String name;
	protected int age;
	protected int weight;
	public int numberOfLaps = 4;
	private int numberOfHvost;

	public Animal() {
		super();
	}

	public Animal(int i) {
		this.numberOfHvost = i;
	}

	public static int test = 4;

	public void run() {
		System.out.println("Run!");
	}

	public void eat() {
		System.out.println("Eat!");
	}

	public void play() {
		System.out.println("Play!");
	}

	public void voice() {
		System.out.println("Привет!");
	}

}
