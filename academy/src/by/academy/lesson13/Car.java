package by.academy.lesson13;

public class Car {

	private String model;
	private CarType type;
	private double cost;

	public Car(String model) {
		this.model = model;
		this.type = CarType.COMPACT;
	}

	public Car(String model, CarType type) {
		this.model = model;
		this.type = type;
	}

	public Car(String model, CarType type, double cost) {
		this.model = model;
		this.type = type;
		this.cost = cost;
	}

	public Car(CarType type, double cost) {
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

	public CarType getType() {
		return type;
	}

	public void setType(CarType type) {
		this.type = type;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
