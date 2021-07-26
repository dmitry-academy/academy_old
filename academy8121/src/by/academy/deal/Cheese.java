package by.academy.deal;

import java.util.Objects;

public class Cheese extends Product {

	private int age;

	public Cheese() {
		super();
	}

	public Cheese(int age) {
		super();
		this.age = age;
	}

	public Cheese(String name, double cost, int quantity, int age) {
		super(name, cost, quantity);
		this.age = age;
	}

	@Override
	protected double discount() {
		if (age < 5) {
			return 0.15;
		}
		return 0;
	}

	public final void doSmth() {

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(age);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cheese other = (Cheese) obj;
		return age == other.age;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cheese [age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}

}
