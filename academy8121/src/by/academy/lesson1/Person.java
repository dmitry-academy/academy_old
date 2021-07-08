package by.academy.lesson1;

public class Person {

	int age;
	String name;

	public Person() {
		super();
	}

	public Person(int age) {
		super();
		this.age = age;
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [age=");
		builder.append(age);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

}
