package by.academy.lesson13.demo;

import by.academy.lesson13.Engine;

public class Car implements Cloneable {

	private String model;
	private CarTypes type;
	private double cost;
	private Engine e;

	public Car(String model) {
		this.model = model;
		this.type = CarTypes.COMPACT;
	}

	public Engine getE() {
		return e;
	}

	public void setE(Engine e) {
		this.e = e;
	}

	public Car(String model, CarTypes type) {
		this.model = model;
		this.type = type;
	}

	public Car(String model, CarTypes type, double cost) {
		this.model = model;
		this.type = type;
		this.cost = cost;
	}

	public Car(String model, CarTypes type, double cost, Engine e) {
		this.model = model;
		this.type = type;
		this.cost = cost;
		this.e = e;
	}

	public Car(CarTypes type, double cost) {
		this.type = type;
		this.cost = cost;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getModel() {
		return model;
	}

	public CarTypes getType() {
		return type;
	}

	public void setType(CarTypes type) {
		this.type = type;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [model=");
		builder.append(model);
		builder.append(", type=");
		builder.append(type);
		builder.append(", cost=");
		builder.append(cost);
		builder.append(", e=");
		builder.append(e);
		builder.append("]");
		return builder.toString();
	}

	public Car clone() throws CloneNotSupportedException {
		return (Car) super.clone();
	}
}
