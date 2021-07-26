package by.academy.deal;

import java.util.Objects;

public abstract class Product {

	protected String name;
	protected double cost;
	protected int quantity;

	public Product() {
		super();
	}

	public Product(String name, double cost, int quantity) {
		super();
		this.name = name;
		this.cost = cost;
		this.quantity = quantity;
	}

	protected abstract double discount();

	public double calcPrice() {
		return (1 - discount()) * cost * quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cost, name, quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost) && Objects.equals(name, other.name)
				&& quantity == other.quantity;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [name=");
		builder.append(name);
		builder.append(", cost=");
		builder.append(cost);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append("]");
		return builder.toString();
	}

}
