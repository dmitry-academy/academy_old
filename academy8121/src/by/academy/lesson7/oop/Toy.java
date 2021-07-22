package by.academy.lesson7.oop;

import java.util.Arrays;

public class Toy {
	String name;
	double cost;
	String[] manufacturer;
	int age;

	public Toy() {
		System.out.println("В конструкторе по умолчанию");
		this.name = "Lego";
		this.manufacturer = new String[10];
		this.manufacturer[0] = "China";
		this.manufacturer[1] = "Dania";
		this.manufacturer[2] = "Belarus";
		this.manufacturer[3] = "Russia";
		this.age = 99;
		this.cost = 9.99;
	}

	public Toy(String name, int cost, String[] manufacturer, int age) {
		this(name, cost, manufacturer);
		this.age = age;
		System.out.println("В конструкторе с четырьмя параметрами");
	}

	public Toy(int cost, String name, String[] manufacturer, int age) {
		this(name, cost, manufacturer);
		this.age = 123;
		System.out.println("В конструкторе с четырьмя параметрами");
	}

	public Toy(int age, double cost) {
		this();
		this.age = age;
		this.cost = cost;
		for (int i = 0; i < manufacturer.length; i++) {
			manufacturer[i] = manufacturer[i] + " alalala";
		}
		System.out.println("В конструкторе с тремя параметрами");
	}

	public Toy(double cost, int age) {
		this();
		this.age = age;
		this.cost = cost;
		for (int i = 0; i < manufacturer.length; i++) {
			manufacturer[i] = manufacturer[i] + " Inc";
		}
		System.out.println("В конструкторе с тремя параметрами");
	}

	public Toy(String name) {
		this();
		this.name = name;
		System.out.println("В конструкторе с тремя параметрами");
	}

	public Toy(String name, int cost, String[] manufacturer) {
		this();
		this.name = name;
		this.cost = cost;
		this.manufacturer = manufacturer;
		System.out.println("В конструкторе с тремя параметрами");
	}

	public Toy(int age) {
		this();
		this.age = age;
		System.out.println("В конструкторе с тремя параметрами");
	}

	public Toy(double cost) {
		this();
		this.name = "Lego";
		System.out.println("В конструкторе с тремя параметрами");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Toy [name=");
		builder.append(name);
		builder.append(", cost=");
		builder.append(cost);
		builder.append(", manufacturer=");
		builder.append(Arrays.toString(manufacturer));
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}

}