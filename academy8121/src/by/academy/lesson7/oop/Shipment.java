package by.academy.lesson7.oop;

public class Shipment extends HeavyBox {
	public double cost;

	public Shipment(int width, int height, int depth, int weight, double cost) {
		super(width, height, depth, weight);
		this.cost = cost;
	}

	public Shipment(double cost) {
		this.cost = cost;
	}
}