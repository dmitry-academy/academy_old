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

	public static void run() {
		System.out.println("Run!");
	}

	public void eat() {
		System.out.println("Eat!");
	}

	public final void play() {
		System.out.println("Play!");
	}

	public void voice() {
		System.out.println("Привет!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getNumberOfLaps() {
		return numberOfLaps;
	}

	public void setNumberOfLaps(int numberOfLaps) {
		this.numberOfLaps = numberOfLaps;
	}

	public int getNumberOfHvost() {
		return numberOfHvost;
	}

	public void setNumberOfHvost(int numberOfHvost) {
		this.numberOfHvost = numberOfHvost;
	}

	public static int getTest() {
		return test;
	}

	public static void setTest(int test) {
		Animal.test = test;
	}

}
